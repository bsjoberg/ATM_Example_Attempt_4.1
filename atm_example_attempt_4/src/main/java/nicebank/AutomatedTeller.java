package nicebank;

public class AutomatedTeller implements Teller {
	private CashSlot cashSlot;
	
	public AutomatedTeller (CashSlot cashSlot) {
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
