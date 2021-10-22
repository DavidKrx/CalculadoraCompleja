package dad.calculadora.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Complejo {
	
	DoubleProperty priReal=new SimpleDoubleProperty();
	DoubleProperty segReal=new SimpleDoubleProperty();
	DoubleProperty priImag=new SimpleDoubleProperty();
	DoubleProperty segImag=new SimpleDoubleProperty();
	StringProperty operador=new SimpleStringProperty();
	DoubleProperty resulReal=new SimpleDoubleProperty();
	DoubleProperty resulImag=new SimpleDoubleProperty();
	
	public final DoubleProperty priRealProperty() {
		return this.priReal;
	}
	
	public final double getPriReal() {
		return this.priRealProperty().get();
	}
	
	public final void setPriReal(final double priReal) {
		this.priRealProperty().set(priReal);
	}
	
	public final DoubleProperty segRealProperty() {
		return this.segReal;
	}
	
	public final double getSegReal() {
		return this.segRealProperty().get();
	}
	
	public final void setSegReal(final double segReal) {
		this.segRealProperty().set(segReal);
	}
	
	public final DoubleProperty priImagProperty() {
		return this.priImag;
	}
	
	public final double getPriImag() {
		return this.priImagProperty().get();
	}
	
	public final void setPriImag(final double priImag) {
		this.priImagProperty().set(priImag);
	}
	
	public final DoubleProperty segImagProperty() {
		return this.segImag;
	}
	
	public final double getSegImag() {
		return this.segImagProperty().get();
	}
	
	public final void setSegImag(final double segImag) {
		this.segImagProperty().set(segImag);
	}
	
	public final StringProperty operadorProperty() {
		return this.operador;
	}
	
	public final String getOperador() {
		return this.operadorProperty().get();
	}
	
	public final void setOperador(final String operador) {
		this.operadorProperty().set(operador);
	}

	public final DoubleProperty resulRealProperty() {
		return this.resulReal;
	}
	

	public final double getResulReal() {
		return this.resulRealProperty().get();
	}
	

	public final void setResulReal(final double resulReal) {
		this.resulRealProperty().set(resulReal);
	}
	

	public final DoubleProperty resulImagProperty() {
		return this.resulImag;
	}
	

	public final double getResulImag() {
		return this.resulImagProperty().get();
	}
	

	public final void setResulImag(final double resulImag) {
		this.resulImagProperty().set(resulImag);
	}
	
	
	
	
	
	
	
	
}
