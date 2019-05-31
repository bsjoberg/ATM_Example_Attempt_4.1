package support;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import nicebank.Account;
import nicebank.AtmUserInterface;
import nicebank.Bank;
import nicebank.CashSlot;
import nicebank.Teller;

public class KnowsTheDomain {
	private Bank myBank;
	private Account myAccount;
	private CashSlot cashSlot;
	private Teller teller;
	private EventFiringWebDriver webDriver;
	
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
          teller = new AtmUserInterface(getCashSlot());
        }

        return teller;
    }

	public EventFiringWebDriver getWebDriver() {
		if (webDriver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\brian\\Documents\\chromedriver_win32\\chromedriver.exe");
			webDriver = new EventFiringWebDriver(new ChromeDriver());
		}
		return webDriver;
	}
}
