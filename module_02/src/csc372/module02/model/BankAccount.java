package csc372.module02.model;

public class BankAccount {
	/**
	 * protected properties
	 */
	protected double balance;
	
	/**
	 * Returns the current balance for this account
	 * @return the balance for this account
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Sets the account ID
	 * @param value The new balance to set the account to.
	 */
	public void setBalance(double value) {
		balance = value;
	}
	
	/**
	 * Constructor
	 */
	public BankAccount() {
		balance = 0.0;		
	}
	
	/**
	 * Deposits an amount of money into this account. This function
	 * expects the amount to be a positive number.
	 * 
	 * @param amount - the amount to add to the account
	 * @throws Exception - thrown when the value is not a positive
	 * value.
	 */
	public void deposit(double amount) throws Exception {
		if(amount > 0) {
			balance = balance + amount;
		} else {
			throw new Exception("Must be a positive number!");
		}
	}
	
	/** 
	 * Removes the provided money from the account
	 * @param amount - the amount to withdraw from the account
	 * @throws Exception - if the number is less than zero or is more than
	 * the account has in it.
	 */
	public void withdrawal(double amount) throws Exception {
		if (amount < 0.0){
			throw new Exception("Must be a positive number!");
		} else {
			balance = balance - amount;
		}
	}
}
