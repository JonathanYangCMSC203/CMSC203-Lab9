
public class CheckingAccount extends BankAccount {
	private final static double FEE = .15;
	
	public CheckingAccount(String name, int initialAmount) {
		super(name, initialAmount);
		this.setAccountNumber(getAccountNumber() + "-10");
	}
	
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
