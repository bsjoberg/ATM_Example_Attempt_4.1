package nicebank;

public class Account {
	private Money balance = new Money(0, 0);
	private int accountNumber = 0;
	private int PIN = 0;
	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void credit(Money amount) {
		if (amount.dollars() >= 0 && amount.cents() >= 0)
			balance = balance.add(amount);
	}

	public Money getBalance() {
		return balance;
	}

	public void withdraw(int dollars) throws InsufficientFundsException {
		if (getBalance().dollars() >= dollars)
			balance = balance.minus(new Money(dollars, 0));
		else
			throw new InsufficientFundsException("Insufficient Funds");
	}

	public int accountNumber() {
		return accountNumber;
	}

	public int PIN() {
		return PIN;
	}

	public void setPIN(int PIN) {
		this.PIN = PIN;
	}
}
