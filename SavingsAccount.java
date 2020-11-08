/**
 * Lab 9- Inheritance Bank Account
 * SavingsAccount class
 * @author Jonathan Yang
 * This class simulate a saving account
 */
public class SavingsAccount extends BankAccount{
	private double rate = .025;
	private int savingsNumber = 0; 
	private String accountNumber;
	
	/**
	 * This is the constructor. This creates a first time user who is creating a Savings Account
	 * @param name The name of the owner
	 * @param amount The amount of money being deposited initially
	 */
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	/**
	 * This create another savings account. It adds 1 for every savings account that the owner has.
	 * @param savingAcc 
	 * @param amount
	 */
	public SavingsAccount(SavingsAccount savingAcc, double amount)
	{
		super(savingAcc, amount);
		this.savingsNumber = savingAcc.savingsNumber;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	/**
	 * This gives interest to the user.
	 */
	public void postInterest()
	{
		super.setBalance(getBalance() * (1 + rate * (1.0/12.0)));
	}
	
	/**
	 * @return accountNumber
	 */
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}	
}
