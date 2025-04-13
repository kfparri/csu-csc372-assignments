package csc372.module02;

import javax.swing.JFrame;

import csc372.module02.controller.BankAccountController;
import csc372.module02.model.BankAccount;
import csc372.module02.model.ApplicationSettings;
import csc372.module02.view.BalanceView;

/**
 * The bank application contains the main class for the application
 * @author 	Kyle Parrish
 * @version	1.0.0
 */
public class BankApplication {

	private static ApplicationSettings settings;
		
	private static JFrame setupFrame(BalanceView view, ApplicationSettings settings) {
		// Create the frame and add the view to it
		JFrame form = new JFrame(settings.getFrameName());
		form.setSize(settings.getFrameWidth(), settings.getFrameHeight());
		form.setResizable(settings.getFrameResizable());
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.add(view);
		form.pack();
		
		return form;
	}
	public static void main(String[] args) {
		// create the settings class
		settings = new ApplicationSettings();
		
		// create the model that will be used 
		BankAccount account = new BankAccount();
		
		// create the view that will build the interface
		BalanceView view = new BalanceView(settings.getElementPadding());
		
		// create the controller that will handle all the logic of the application
		BankAccountController controller = new BankAccountController(account, view);		
		
		JFrame myFrame = setupFrame(view, settings);
		myFrame.setVisible(true);
		
	}	
}
