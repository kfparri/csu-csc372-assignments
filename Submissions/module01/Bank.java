package csc372.module01;

/**
 * This is the main class for this project.  This class tests out 
 * all of the functions and properties of the BankAccount and
 * CheckingAccount classes to ensure they work as expected and 
 * output the results to the console window.
 * 
 * @author		Kyle Parrish
 * @version		1.0.0
 */
public class Bank {

	/**
	 * The main function for the program.
	 * @param args
	 */
	public static void main(String[] args) {
		testBankAccountClass();
		
		System.out.println("");
		System.out.println("");
		
		testCheckingAccountClass();
	}
	
	/**
	 * This function creates an instance of the CheckingAccount
	 * class and tests the new properties and functions created
	 * for that class.
	 */
	private static void testCheckingAccountClass() {
		String firstname = "Kyle";
		String lastname = "Parrish";
		int accountid = 143;
		
		System.out.println("Creating new checking account class...");
		
		CheckingAccount checking = new CheckingAccount();
		
		checking.SetFirstName(firstname);
		checking.SetLastName(lastname);
		checking.SetAccountID(accountid);
		
		try {
			checking.deposit(100.0);
		} catch (Exception e) {
			System.out.println("Invalid deposit amount");
		}
		
		checking.SetInterestRate(2.5);
		
		System.out.println("Attempt to overdraw on the checking account (withdraw 120, account balance 100)");
		
		checking.processWithdrawal(120);
		
		System.out.println("New account balance: " + checking.GetBalance());
		System.out.println("");
		
		checking.displayAccount();
	}

	/**
	 * This function creates an instance of the BankAccount class
	 * and tests out all of the functions and properties we 
	 * created for that class.
	 */
	private static void testBankAccountClass() {
		String firstname = "Kyle";
		String lastname = "Parrish";
		int accountid = 142;
		
		BankAccount account = new BankAccount();
		
		System.out.println("Setting First Name...");
		account.SetFirstName(firstname);		
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Verifying First Name");
		
		if(account.GetFirstName() == firstname) {
			System.out.println("First name matches!");
		} else {
			System.out.println("First name does not match!");
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Setting Last Name...");
		account.SetLastName(lastname);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Verifying Last Name");
		
		if(account.GetLastName() == lastname) {
			System.out.println("Last name matches!");
		} else {
			System.out.println("Last name does not match!");
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Setting Account ID...");
		account.SetAccountID(accountid);
		
		System.out.println("Verifying Account ID");
		
		if(account.GetAccountID() == accountid) {
			System.out.println("Account ID matches!");
		} else {
			System.out.println("Account ID does not match!");
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Testing deposit/withdrawal methods");
		
		try {
			System.out.println("Depositing $100");
			account.deposit(100.0);
		} catch (Exception e) {
			System.out.println("Caught error when depositing, error message: " + e.getMessage());
		}
		
		
		try {
			System.out.println("Depositing $200");
			account.deposit(200.0);
		} catch (Exception e) {
			System.out.println("Caught error when depositing, error message: " + e.getMessage());
		}
		
		try {
			System.out.println("Trying to deposit an invalid amount ($-100)");
			account.deposit(-100.0);			
		} catch(Exception e) {
			System.out.println("Caught error when depositing, error message: " + e.getMessage());
		}
		
		System.out.println("Testing if account balance is correct (Expecting 300)");
		
		if(account.GetBalance() == 300.0) {
			System.out.println("Account balance is correct!");
		} else {
			System.out.println("Account balance is not correct!  Actually got " + account.GetBalance());
		}
		
		try {
			System.out.println("Withdrawing 50");
			account.withdrawal(50);
		} catch (Exception e) {
			System.out.println("Caught error when withdrawing, error message: " + e.getMessage());
		}
		
		try {
			System.out.println("Withdrawing 60");
			account.withdrawal(60);
		} catch (Exception e) {
			System.out.println("Caught error when withdrawing, error message: " + e.getMessage());
		}
		
		try {
			System.out.println("Attempting to withdraw an invalid amount (-100)");
			account.withdrawal(-100.0);
		} catch (Exception e) {
			System.out.println("Caught error when withdrawing, error message: " + e.getMessage());
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Validating new balance");
		
		if(account.GetBalance() == 190.0) {
			System.out.println("Account balance is correct!");
		} else {
			System.out.println("Account balance is not correct!");
		}
		
		System.out.println("");
		System.out.println("");
		
		account.accountSummary();
	}
}
