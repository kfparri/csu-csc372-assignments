package csc372.module01;

/**
 * A checking account is a subclass of the BankAccount class.
 * This class implements a new property (interest rate) and
 * two new functions (processWithdrawal, and displayAccount).
 * 
 * @author 		Kyle Parrish
 * @version		1.0.0
 */
public class CheckingAccount extends BankAccount {
	/**
	 * New properties
	 */
	private double interestRate;
	
	/**
	 * Get the current interest rate
	 * @return the current interest rate for this account
	 */
	public double GetInterestRate() {
		return interestRate;		
	}
	
	/**
	 * Sets the current interest rate
	 * @param value the new interest rate for this account
	 */
	public void SetInterestRate(double value) {
		interestRate = value;
	}
	
	/**
	 * processWithdrawal is like the normal withdrawal function 
	 * except with a checking account, you can overdraft the 
	 * account (for a fee of $30).  So if the amount is more
	 * than what is in the account, you have to add 30 to the 
	 * value before deducting it from the balance (which can
	 * now be zero)
	 * 
	 * @param amount to withdrawal.
	 */
	public void processWithdrawal(double amount) {
		if(amount > balance) {
			amount += 30;			
		}
		
		balance = balance - amount;
	}
	
	/**
	 * This display function will call the superclass
	 * accountSummary function and then add the new
	 * interest rate property after that
	 */
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate...." + interestRate + "%");
	}
}
