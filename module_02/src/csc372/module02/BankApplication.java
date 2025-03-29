package csc372.module02;

import javax.swing.JFrame;

import csc372.module02.controller.BankAccountController;
import csc372.module02.model.BankAccount;
import csc372.module02.view.BalanceView;

public class BankApplication {

	static final int FRAME_WIDTH = 500;
	static final int FRAME_HEIGHT = 250;
	static final String FRAME_NAME = "Bank Application";
	static final boolean FRAME_RESIZABLE = false;
	static final int PADDING = 10;
		
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		BalanceView view = new BalanceView(PADDING);
		BankAccountController controller = new BankAccountController(account, view);
		
		JFrame myFrame = new JFrame(FRAME_NAME);
		myFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		myFrame.setResizable(FRAME_RESIZABLE);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(view);
		myFrame.pack();
		myFrame.setVisible(true);
		
	}	
}
