package csc372.module02.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;


public class BalanceView extends JPanel {
	private JLabel balancePrompt, balanceLabel, messageLabel;
	private JButton setBalanceButton, depositButton, withdrawButton, resetButton;
	
	public BalanceView(int padding) {
		setLayout(new GridLayout(0, 3, padding, padding));
		
		balancePrompt = new JLabel("Balance: ");
		balanceLabel = new JLabel(" ");
		setBalanceButton = new JButton("Set Initial Balance");
		
		depositButton = new JButton("Deposit");
		withdrawButton = new JButton("Withdraw");
		resetButton = new JButton("Reset");
		
		messageLabel = new JLabel(" ");
		
		add(balancePrompt);
		add(balanceLabel);
		add(setBalanceButton);
		add(depositButton);
		add(withdrawButton);
		add(resetButton);
		add(messageLabel);
	}
	
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
