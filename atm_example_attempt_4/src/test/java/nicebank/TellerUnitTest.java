package nicebank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TellerUnitTest {

	private Account account;
	
	@Before
	public void setUp() throws Exception {
		account = new Account(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_should_not_be_able_to_withdraw_more_than_available() {
		account.credit(new Money(75, 0));
		CashSlot cashSlot = new CashSlot();
		Teller teller = new AutomatedTeller(cashSlot);
		try {
			teller.withdrawFrom(account, 100);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("Incorrect Balance", 0, cashSlot.getContents());
	}
}
