/**
 * Lab 9- Inheritance Bank Accounts
 * Checking Account class.
 * @author Jonathan Yang
 * This class simulates the checking account
 */

public class CheckingAccount extends BankAccount {
	/**
	 * This is the amount of money it takes to create a transaction
	 */
	private final static double FEE = .15;
	
	/**
	 * This is the constructor. It creates a new checking account
	 * @param name The owner's name
	 * @param initialAmount The amount of money being deposited in the bank initially.
	 */
	public CheckingAccount(String name, int initialAmount) {
		super(name, initialAmount);
		this.setAccountNumber(getAccountNumber() + "-10");
	}
	
	/**
	 * This method allows money to be withdrawn from the bank.
	 * @return completed This method returns true if the the money allows to be withdrawn. False if money cannot be withdrawn.
	 */
	@Override
	public boolean withdraw(double amount)
	{
		boolean completed = true;

		if (amount <= getBalance())
			setBalance(getBalance() - amount - FEE);

		else
			completed = false;

		return completed;
	}
	
}
