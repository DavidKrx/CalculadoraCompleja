package dad.calculadora.view;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Vista extends HBox{
	private TextField primerRealText;
	private TextField segundoRealText;
	private TextField primerImagText;
	private TextField segundoImagText;
	private TextField resultRealText;
	private TextField resultImagText;
	private ComboBox<String> operadoresCombo;
	
	public Vista() {
		operadoresCombo=new ComboBox<String>();
		operadoresCombo.getItems().addAll("+","-","*","/");
		operadoresCombo.setMaxWidth(60);
		operadoresCombo.getSelectionModel().selectFirst();
		
		primerRealText=new TextField("0");
		primerRealText.setMaxWidth(60);
		primerRealText.setAlignment(Pos.CENTER);
		
		primerImagText=new TextField("0");
		primerImagText.setMaxWidth(60);
		primerImagText.setAlignment(Pos.CENTER);
		
		segundoRealText=new TextField("0");
		segundoRealText.setMaxWidth(60);
		segundoRealText.setAlignment(Pos.CENTER);
		
		segundoImagText=new TextField("0");
		segundoImagText.setMaxWidth(60);
		segundoImagText.setAlignment(Pos.CENTER);
		
		resultRealText=new TextField("0");
		resultRealText.setEditable(false);
		resultRealText.setMaxWidth(60);
		resultRealText.setAlignment(Pos.CENTER);
		
		resultImagText=new TextField("0");
		resultImagText.setEditable(false);
		resultImagText.setMaxWidth(60);
		resultImagText.setAlignment(Pos.CENTER);
		
		VBox leftBox=new VBox();	
		leftBox.setSpacing(5);
		leftBox.setAlignment(Pos.CENTER);
		leftBox.getChildren().add(operadoresCombo);
		
		HBox primHBox=new HBox();
		primHBox.setSpacing(5);
		primHBox.getChildren().addAll(primerRealText, new Label(" + "), primerImagText,  new Label("i"));
	
		HBox segHBox=new HBox();
		segHBox.setSpacing(5);
		segHBox.getChildren().addAll(segundoRealText,new Label(" + "), segundoImagText,  new Label("i"));
		
		HBox resultHBox=new HBox();
		resultHBox.setSpacing(5);
		resultHBox.getChildren().addAll(resultRealText,new Label(" + "), resultImagText,  new Label("i"));
		
		Separator separador=new Separator();	
		
		VBox midBox=new VBox();
		midBox.getChildren().addAll(primHBox,segHBox,separador,resultHBox);
		midBox.setSpacing(5);
		midBox.setAlignment(Pos.CENTER);

		setSpacing(5);
		setAlignment(Pos.CENTER);
		getChildren().addAll(leftBox,midBox);
	}
	
	public TextField getPrimerRealText() {
		return primerRealText;
	}

	public TextField getSegundoRealText() {
		return segundoRealText;
	}

	public TextField getPrimerImagText() {
		return primerImagText;
	}

	public TextField getSegundoImagText() {
		return segundoImagText;
	}

	public TextField getResultRealText() {
		return resultRealText;
	}

	public void setResultRealText(TextField resultRealText) {
		this.resultRealText = resultRealText;
	}

	public TextField getResultImagText() {
		return resultImagText;
	}

	public void setResultImagText(TextField resultImagText) {
		this.resultImagText = resultImagText;
	}

	public ComboBox<String> getOperadoresCombo() {
		return operadoresCombo;
	}

	public void setOperadoresCombo(ComboBox<String> operadoresCombo) {
		this.operadoresCombo = operadoresCombo;
	}

}
