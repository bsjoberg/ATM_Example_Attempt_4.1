package support;

import nicebank.Account;
import nicebank.AutomatedTeller;
import nicebank.CashSlot;
import nicebank.Teller;

public class KnowsTheDomain {
	private Account myAccount;
	private CashSlot cashSlot;
	private Teller teller;

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
          teller = new AutomatedTeller(getCashSlot());
        }

        return teller;
    }
}
