package nicebank;

public class Account {
	private Money balance = new Money();
	
	public void credit(Money amount) {
		balance = balance.add(amount);
	}

	public Money getBalance() {
		return balance;
	}

	public void debit(int dollars) throws InsufficientFundsException {
		if (getBalance().dollars() >= dollars)
			balance = balance.minus(new Money(dollars, 0));
		else
			throw new InsufficientFundsException("Insufficient Funds");
	}
}
