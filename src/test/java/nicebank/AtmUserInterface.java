package nicebank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import hooks.ServerHooks;

public class AtmUserInterface implements Teller {
	private final EventFiringWebDriver webDriver;
	private String reasonForNoWithdrawal = "";

	public AtmUserInterface(CashSlot cashSlot) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\brian\\Documents\\chromedriver_win32\\chromedriver.exe");
		this.webDriver = new EventFiringWebDriver(new ChromeDriver());
	}

	public void withdrawFrom(Account account, int dollars) throws InsufficientFundsException {
		try {
			webDriver.get("http://localhost:" + ServerHooks.PORT);
			webDriver.findElement(By.id("amount")).sendKeys(String.valueOf(dollars));
			webDriver.findElement(By.id("withdraw")).click();
		}
		finally {
			webDriver.close();
		}
	}

	public String notDispensedReason() {
		return reasonForNoWithdrawal;
	}

}
