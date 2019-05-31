package nicebank;

public interface Teller {

	void withdrawFrom(Account account, int dollars) throws InsufficientFundsException;

	String notDispensedReason();
	
}
