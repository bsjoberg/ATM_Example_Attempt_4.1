package nicebank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AtmUserInterface implements Teller {
	private final EventFiringWebDriver webDriver;
	private String reasonForNoWithdrawal = "";

	public AtmUserInterface() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\brian\\Documents\\chromedriver_win32\\chromedriver.exe");
		this.webDriver = new EventFiringWebDriver(new ChromeDriver());
	}

	@Override
	public void withdrawFrom(Account account, int dollars) throws InsufficientFundsException {
		try {
			webDriver.get("http://localhost:9988");
			webDriver.findElement(By.id("Amount")).sendKeys(String.valueOf(dollars));
			webDriver.findElement(By.id("Withdraw")).click();
		} finally {
			webDriver.close();
		}
	}

	@Override
	public String notDispensedReason() {
		return reasonForNoWithdrawal;
	}

}
