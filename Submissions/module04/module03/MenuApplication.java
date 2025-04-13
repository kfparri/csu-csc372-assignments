package csc372.module03;

import csc372.module03.controller.MenuController;
import csc372.module03.model.MenuSettings;
import csc372.module03.view.MenuView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * MenuApplication - This application displays a simple UI to managing the balance of 
 * 	a bank account
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class MenuApplication extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			// Create the settings class that has all the static values we use in the application
			MenuSettings settings = new MenuSettings();
			
			// Create the view class that creates the UI for the application
			MenuView view = new MenuView(settings);
			
			// Create the controller to manage the logic for the view
			new MenuController(view, settings);
			
			// Create the scene that will hold all the UI elements and set the layout, height and width 
			Scene scene = new Scene(view.getLayout(), settings.getWidth(), settings.getHeight());
			
			// Set the title of the stage (window) 
			primaryStage.setTitle(settings.getTitle());
			
			// Assign the scene to the stage
			primaryStage.setScene(scene);
			
			// display the stage
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
