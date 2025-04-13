package csc372.module03.view;

import csc372.module03.model.MenuSettings;
import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class MenuView {
	BorderPane layout;
	private MenuBar menuBar;
	private Menu menu;
	private MenuItem menuOption1, menuOption2, menuOption3, menuOption4;
	private TextField textField;
	
	public MenuView(MenuSettings settings) {
		layout = new BorderPane();
		menu = new Menu(settings.getMenuTitle());
		menuBar = new MenuBar();
		menuOption1 = new MenuItem(settings.getMenuOption1Text());
		menuOption2 = new MenuItem(settings.getMenuOption2Text());
		menuOption3 = new MenuItem(settings.getMenuOption3Text());
		menuOption4 = new MenuItem(settings.getMenuOption4Text());
		
		menu.getItems().addAll(menuOption1, menuOption2, menuOption3, menuOption4);
		
		menuBar.getMenus().add(menu);
		
		textField = new TextField();
		
		layout.setTop(menuBar);
		layout.setCenter(textField);		
	}
	
	public Parent getLayout() {
		return layout;
	}
	
	public void updateTextField(String value) {
		textField.setText(value);
	}
	
	public String getTextFieldText() {
		return textField.getText();
	}
	
	public MenuItem getMenuOption1() {
		return menuOption1;
	}
	
	public MenuItem getMenuOption2() {
		return menuOption2;
	}
	
	public MenuItem getMenuOption3() {
		return menuOption3;
	}
	
	public MenuItem getMenuOption4() {
		return menuOption4;
	}
}
