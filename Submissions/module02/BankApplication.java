package csc372.module02;

import javax.swing.JFrame;

import csc372.module02.controller.BankAccountController;
import csc372.module02.model.BankAccount;
import csc372.module02.view.BalanceView;

/**
 * The bank application contains the main class for the application
 * @author 	Kyle Parrish
 * @version	1.0.0
 */
public class BankApplication {

	// create some static variables with different settings for the interface
	static final int FRAME_WIDTH = 500;
	static final int FRAME_HEIGHT = 250;
	static final String FRAME_NAME = "Bank Application";
	static final boolean FRAME_RESIZABLE = false;
	static final int PADDING = 10;
		
	public static void main(String[] args) {
		// create the model that will be used 
		BankAccount account = new BankAccount();
		
		// create the view that will build the interface
		BalanceView view = new BalanceView(PADDING);
		
		// create the controller that will handle all the logic of the application
		BankAccountController controller = new BankAccountController(account, view);
		
		// Create the frame and add the view to it
		JFrame myFrame = new JFrame(FRAME_NAME);
		myFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		myFrame.setResizable(FRAME_RESIZABLE);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(view);
		myFrame.pack();
		myFrame.setVisible(true);
		
	}	
}
