package se.school.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import se.school.calculator.scenes.*;

public class Launcher extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Create and set scene
		Scene calcScene = new CalculatorScene().getScene();
		stage.setScene(calcScene);
		
		// Set title and show
		stage.setTitle("EvilCorp Calculator");
		stage.show();
	}
}
