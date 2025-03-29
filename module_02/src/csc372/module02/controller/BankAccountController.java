package csc372.module02.controller;

import csc372.module02.model.BankAccount;
import csc372.module02.view.BalanceView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class BankAccountController {
	private BankAccount account;
	private BalanceView view;
	private boolean initialized = false;
	
	public BankAccountController(BankAccount model, BalanceView view) {
		this.account = model;
		this.view = view;
		
		view.addSetBalanceListener(new SetBalanceListener());
		view.addDepositListener(new DepositListener());
		view.addWithdrawListener(new WithdrawListener());
		view.addResetListener(new ResetListener());
		
		updateView();
	}
	
	public void updateView() {
		view.setBalance(account.getBalance());
		
		view.initialBalanceEnabled(!initialized);
		view.depositEnabled(initialized);
		view.withdrawEnabled(initialized);
		view.resetEnabled(initialized);
	}
	
	private class WithdrawListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String response = JOptionPane.showInputDialog(null, "Enter amount to withdraw:");
			
			if( response != null && !response.trim().isEmpty() ) {
				try {
					double amount = Double.parseDouble(response);
					
					account.withdrawal(amount);
					updateView();
				} catch ( NumberFormatException ex ) {
					JOptionPane.showMessageDialog(null, "Invalid value to withdraw, please enter a positive number: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error when trying to withdraw amount: " + e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
	
	private class ResetListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			account.setBalance(0.0);
			initialized = false;
			updateView();
		}
	}
	
	private class DepositListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String response = JOptionPane.showInputDialog(null, "Enter amount to deposit:");
			
			if(response != null && !response.trim().isEmpty()) {
				try {
					double amount = Double.parseDouble(response);
					
					account.deposit(amount);
					// update view
					updateView();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Invalid value to deposit, please enter a positive number: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error when trying to deposit amount: " + e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);					
				}
			}
		}
	}
	
	private class SetBalanceListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String response = JOptionPane.showInputDialog(null, "Enter starting balance:");
			
			if(response != null && !response.trim().isEmpty()) {
				try {
					double amount = Double.parseDouble(response);	
					account.setBalance(amount);
					initialized = true;
					updateView();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,  "Invalid value for a balance.  Please enter a valid number: error message: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Please enter a value for starting balance", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}


