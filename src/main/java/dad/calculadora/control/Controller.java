package dad.calculadora.control;

import dad.calculadora.model.Complejo;

import dad.calculadora.view.Vista;
import javafx.beans.Observable;
import javafx.util.converter.NumberStringConverter;

public class Controller {
	private Complejo model=new Complejo();
	private Vista view=new Vista();

	public Controller() {
		//bindings
		view.getPrimerRealText().textProperty().bindBidirectional(model.priRealProperty(), new NumberStringConverter());
		view.getPrimerImagText().textProperty().bindBidirectional(model.priImagProperty(), new NumberStringConverter());
		
		view.getSegundoRealText().textProperty().bindBidirectional(model.segRealProperty(),new NumberStringConverter());
		view.getSegundoImagText().textProperty().bindBidirectional(model.segImagProperty(), new NumberStringConverter());
		
		view.getResultRealText().textProperty().bindBidirectional(model.resulRealProperty(), new NumberStringConverter());
		view.getResultImagText().textProperty().bindBidirectional(model.resulImagProperty(), new NumberStringConverter());
		
		model.operadorProperty().bind(view.getOperadoresCombo().getSelectionModel().selectedItemProperty());
		//listener
		model.operadorProperty().addListener((o, ov, nv) -> onOperatorChanged(nv));
	}
	private void onOperatorChanged(String nv) {
		switch(nv){
		case"+":
			model.resulRealProperty().bind(model.priRealProperty().add(model.segRealProperty()));
			model.resulImagProperty().bind(model.priImagProperty().add(model.segImagProperty()));
			break;
		case"-":
			model.resulRealProperty().bind(model.priRealProperty().add(model.segRealProperty().negate()));
			model.resulImagProperty().bind(model.priImagProperty().add(model.segImagProperty().negate()));
			break;
		case"*":
			model.resulRealProperty().bind(model.priRealProperty().multiply(model.segRealProperty()));
			model.resulImagProperty().bind(model.priImagProperty().multiply(model.segImagProperty()));
			break;
		case"/":
			model.resulRealProperty().bind(model.priRealProperty().divide(model.segRealProperty()));
			model.resulImagProperty().bind(model.priImagProperty().divide(model.segImagProperty()));
			break;
	}
	}
	public Vista getView() {
		return view;
	}
	public Complejo getModel() {
		return model;
	}
}
