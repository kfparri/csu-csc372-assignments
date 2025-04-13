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
		
		System.out.println("\n");
		
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
		
		checking.setFirstName(firstname);
		checking.setLastName(lastname);
		checking.setAccountID(accountid);
		
		try {
			checking.deposit(100.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		checking.SetInterestRate(2.5);
		
		System.out.println("Attempt to overdraw on the checking account (withdraw 120, account balance 100)");
		
		checking.processWithdrawal(120);
		
		System.out.println("New account balance: " + checking.getBalance());
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
		account.setFirstName(firstname);		
		
		System.out.println("\n");
		
		System.out.println("Verifying First Name");
		
		if(account.getFirstName() == firstname) {
			System.out.println("First name matches!");
		} else {
			System.out.println("First name does not match!");
		}
		
		System.out.println("\n");
		
		System.out.println("Setting Last Name...");
		account.setLastName(lastname);
		
		System.out.println("\n");
		
		System.out.println("Verifying Last Name");
		
		if(account.getLastName() == lastname) {
			System.out.println("Last name matches!");
		} else {
			System.out.println("Last name does not match!");
		}
		
		System.out.println("\n");
		
		System.out.println("Setting Account ID...");
		account.setAccountID(accountid);
		
		System.out.println("Verifying Account ID");
		
		if(account.getAccountID() == accountid) {
			System.out.println("Account ID matches!");
		} else {
			System.out.println("Account ID does not match!");
		}
		
		System.out.println("\n");
		
		System.out.println("Testing deposit/withdrawal methods");
		
		try {
			System.out.println("Depositing $100");
			account.deposit(100.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("Depositing $200");
			account.deposit(200.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Trying to deposit an invalid amount ($-100)");
			account.deposit(-100.0);			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Testing if account balance is correct (Expecting 300)");
		
		if(account.getBalance() == 300.0) {
			System.out.println("Account balance is correct!");
		} else {
			System.out.println("Account balance is not correct!  Actually got " + account.getBalance());
		}
		
		try {
			System.out.println("Withdrawing 50");
			account.withdrawal(50);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Withdrawing 60");
			account.withdrawal(60);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Attempting to withdraw an invalid amount (-100)");
			account.withdrawal(-100.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n");
		
		System.out.println("Validating new balance");
		
		if(account.getBalance() == 190.0) {
			System.out.println("Account balance is correct!");
		} else {
			System.out.println("Account balance is not correct!");
		}
		
		System.out.println("\n");
		
		account.accountSummary();
	}
}
