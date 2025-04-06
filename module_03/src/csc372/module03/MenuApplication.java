package csc372.module03;

import csc372.module03.controller.MenuController;
import csc372.module03.model.MenuSettings;
import csc372.module03.view.MenuView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuApplication extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuSettings settings = new MenuSettings();
		MenuView view = new MenuView(settings);
		new MenuController(view, settings);
		
		Scene scene = new Scene(view.getLayout(), settings.getWidth(), settings.getHeight());
		primaryStage.setTitle(settings.getTitle());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
