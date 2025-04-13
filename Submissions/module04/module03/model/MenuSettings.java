package csc372.module03.model;

/**
 * MenuSettings - This is a simple class to manage all the static settings used in 
 * 	the application
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class MenuSettings {
	// Create private variables for all the setting options
	private String menuOption1Text, menuOption2Text, menuOption3Text, menuOption4Text, menuTitle, title;
	private int width, height;
	
	// These settings are for each of the different menu options in the 
	//	application.  If the value is null, return a default value
	public String getMenuOption1Text() {
		return menuOption1Text != null ? menuOption1Text : "Untitled";
	}
	
	public String getMenuOption2Text() {
		return menuOption2Text != null ? menuOption2Text : "Untitled";
	}
	
	public String getMenuOption3Text() {
		return menuOption3Text != null ? menuOption3Text : "Untitled";
	}
	
	public String getMenuOption4Text() {
		return menuOption4Text != null ? menuOption4Text : "Untitled";
	}
	
	// Return the title of the menu of the form.
	public String getMenuTitle() {
		return menuTitle != null ? menuTitle : "Untitled";
	}
	
	// Return the title that will appear on the title of the main window
	public String getTitle() {
		return title != null ? title : "Untitled";
	}
	
	// Return the width of the form
	public int getWidth() {
		return width > 0 ? width : 600;
	}
	
	// Return the height of the form
	public int getHeight() {
		return height > 0 ? height : 800;
	}
	
	public MenuSettings() {
		// Set the default values for each of the properties,
		//	If we were to load this settings from a config file, 
		// 	here is where we would do that.
		menuOption1Text = "Option 1 - Get current time";
		menuOption2Text = "Option 2 - Write TextBox to file";
		menuOption3Text = "Option 3 - Change background Color";
		menuOption4Text = "Option 4 - Exit";
		menuTitle = "Menu";
		title = "Menu Bar Options";
		width = 400;
		height = 300;
	}
}
