package dad.calculadora;

import dad.calculadora.control.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
	private Controller mycontroller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		mycontroller=new Controller();
		
		primaryStage.setTitle("CalculadoraCompleja");
		primaryStage.setScene(new Scene(mycontroller.getView(),320,200));
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
