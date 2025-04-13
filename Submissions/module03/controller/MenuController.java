package csc372.module03.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JOptionPane;

import csc372.module03.model.MenuSettings;
import csc372.module03.view.MenuView;

public class MenuController {
	private final Random random = new Random();
	private final MenuView view;
	private final MenuSettings settings;
	
	public MenuController(MenuView view, MenuSettings settings) {
		this.view = view;
		this.settings = settings;
		
		attachEvents();
	}
	
	private void attachEvents() {
		view.getMenuOption1().setOnAction(e -> {
			String timestamp = new SimpleDateFormat("MM-dd-yyyy_HHmmss").format(Calendar.getInstance().getTime());
			view.updateTextField(timestamp);
		});
		
		view.getMenuOption2().setOnAction(e -> {
			try(FileWriter writer = new FileWriter("log.txt")) {
				writer.write(view.getTextFieldText());
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(null, ex.getStackTrace(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		view.getMenuOption3().setOnAction(e -> {
			// change frame background color
			int greenShade = 100 + random.nextInt(156);
			String shade = String.format("rgb(0, %d, 0)", greenShade);
			
			view.getLayout().setStyle("-fx-background-color: " + shade);
			view.getMenuOption3().setText(settings.getMenuOption3Text() + shade);
		});
		
		view.getMenuOption4().setOnAction(e -> {
			System.exit(0);
		});
	}
}
