package nicebank;


public class Teller {
	private CashSlot cashSlot;
	boolean sufficientFunds = false;
	
	public Teller (CashSlot cashSlot) {
		this.cashSlot = cashSlot;
	}
	
	public boolean withdrawFrom(Account account, int dollars) {
		if (account.getBalance().dollars() >= dollars) {
			sufficientFunds = true;
			cashSlot.dispense(dollars);
		}
		else {
			sufficientFunds = false;
			cashSlot.dispense(0);
		}
		return sufficientFunds;
	}
	
	
}
