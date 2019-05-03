package nicebank;


public class Teller {
	private CashSlot cashSlot;
	
	public Teller (CashSlot cashSlot) {
		this.cashSlot = cashSlot;
	}
	
	public void withdrawFrom(Account account, int dollars) throws InsufficientFundsException {
		try {
			account.debit(dollars);
			cashSlot.dispense(dollars);
		} catch (InsufficientFundsException ife) {
			cashSlot.dispense(0);
		}
	}
	
	
}
