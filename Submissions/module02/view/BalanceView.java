package csc372.module02.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

/**
 * The BalanceView class builds the user interface for this application
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class BalanceView extends JPanel {
	// Define the elements to be used in this view
	private JLabel balancePrompt, balanceLabel, messageLabel;
	private JButton setBalanceButton, depositButton, withdrawButton, resetButton;
	
	public BalanceView(int padding) {
		// set the layout for this view to be a simple grid, a 0 for the first value
		//  allows for an unlimited number of rows
		setLayout(new GridLayout(0, 3, padding, padding));
		
		// initialize all the controls
		balancePrompt = new JLabel("Balance: ");
		balanceLabel = new JLabel(" ");
		setBalanceButton = new JButton("Set Initial Balance");
		
		depositButton = new JButton("Deposit");
		withdrawButton = new JButton("Withdraw");
		resetButton = new JButton("Reset");
		
		messageLabel = new JLabel(" ");
		
		// Add the controls to the panel, when using a GridLayout,
		//  the controls are added left to right and then down to the next row
		//  so the order of adding here is important!
		add(balancePrompt);
		add(balanceLabel);
		add(setBalanceButton);
		add(depositButton);
		add(withdrawButton);
		add(resetButton);
		add(messageLabel);
	}
	
	// properties for this view (to interact with it)
	public void setBalance(double newBalance) {
		balanceLabel.setText(String.format("%.2f", newBalance));
	}
	
	public void initialBalanceEnabled(boolean value) {
		setBalanceButton.setEnabled(value);
	}
	
	public void depositEnabled(boolean value) {
		depositButton.setEnabled(value);
	}
	
	public void withdrawEnabled(boolean value) {
		withdrawButton.setEnabled(value);
	}
	
	public void resetEnabled(boolean value) {
		resetButton.setEnabled(value);
	}
	
	// Create listeners so you can wire up to the button listener events
	public void addSetBalanceListener(ActionListener listener) {
		setBalanceButton.addActionListener(listener);
	}
	
	public void addDepositListener(ActionListener listener) {
		depositButton.addActionListener(listener);
	}
	
	public void addWithdrawListener(ActionListener listener) {
		withdrawButton.addActionListener(listener);
	}
	
	public void addResetListener(ActionListener listener) {
		resetButton.addActionListener(listener);
	}
}
