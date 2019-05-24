package support;

import nicebank.Account;
import nicebank.AtmUserInterface;
import nicebank.AutomatedTeller;
import nicebank.Bank;
import nicebank.CashSlot;
import nicebank.Teller;

public class KnowsTheDomain {
	private Bank myBank;
	private Account myAccount;
	private CashSlot cashSlot;
	private Teller teller;
	
	public Bank getMyBank() {
		if (myBank == null)
			myBank = new Bank();
		
		return myBank;
	}
	
	public Account getMyAccount() {
		if (myAccount == null)
			myAccount = new Account(1234);
		
		return myAccount;
	}
	
    public CashSlot getCashSlot() {
        if (cashSlot == null){
          cashSlot = new CashSlot();
        }
    
        return cashSlot;
      }
    
    public Teller getTeller() {
        if (teller == null) {
          teller = new AtmUserInterface();
        }

        return teller;
    }
}
