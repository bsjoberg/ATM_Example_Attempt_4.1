package nicebank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import hooks.ServerHooks;

public class AtmUserInterface implements Teller {
	private final EventFiringWebDriver webDriver;
	private String reasonForNoWithdrawal = "";

	public AtmUserInterface(CashSlot cashSlot) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\brian\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
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
