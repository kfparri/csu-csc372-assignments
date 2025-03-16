package csc372.module01;

/**
 * The BankAccount class acts as a superclass for all bank 
 * related classes.
 * 
 * @author 		Kyle Parrish
 * @version		1.0.0
 */
public class BankAccount {
	
	/**
	 * protected properties
	 */
	protected String firstName;	
	
	protected String lastName;
	
	protected int accountID;
	
	protected double balance;
	
	/**
	 * Returns the current value of the firstName property
	 * @return The value stored in the firstName property
	 */
	public String GetFirstName() {
		return firstName;
	}
	
	/**
	 * Sets firstname property
	 * @param value The value to be saved as the account
	 * owners first name
	 */
	public void SetFirstName(String value) {
		firstName = value;
	}
	
	/**
	 * Get the account owners last name
	 * @return the value stored in the lastname property
	 */
	public String GetLastName() {
		return lastName;		
	}
	
	/**
	 * Sets the account owners last name
	 * @param value the value to be set in the lastname property
	 */
	public void SetLastName(String value) {
		lastName = value;
	}
	
	/**
	 * Gets the account ID
	 * @return The account ID for this account.
	 */
	public int GetAccountID() {
		return accountID;
	}
	
	/**
	 * Sets the account ID
	 * @param value The ID to assign to this account.
	 */
	public void SetAccountID(int value) {
		accountID = value;
	}
	
	/**
	 * Returns the current balance for this account
	 * @return the balance for this account
	 */
	public double GetBalance() {
		return balance;
	}
	
	/**
	 * Constructor
	 */
	public BankAccount() {
		firstName = "";
		lastName = "";
		accountID = 0;
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
			throw new Exception("Invalid amount");
		}
	}
	
	/** 
	 * Removes the provided money from the account
	 * @param amount - the amount to withdraw from the account
	 * @throws Exception - if the number is less than zero or is more than
	 * the account has in it.
	 */
	public void withdrawal(double amount) throws Exception {
		if(amount > balance) {
			throw new Exception("Insufficient balance to withdraw!");
		} else if (amount < 0.0){
			throw new Exception("Must be a positive number!");
		} else {
			balance = balance - amount;
		}
	}
	
	/*
	 * prints out the current information for this account.
	 */
	public void accountSummary() {
		System.out.println("Account summary for " + firstName + " " + lastName + ":");
		System.out.println("AccountID........" + accountID);
		System.out.println("Balance..........$" + String.format("%.2f", balance));
	}
}
