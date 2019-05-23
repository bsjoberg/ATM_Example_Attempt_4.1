package nicebank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class BankUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_has_one_Account() {
		Bank bank = new Bank();
		Account accountMock = Mockito.mock(Account.class);
		bank.addAccount(accountMock);
		Assert.assertEquals(1, bank.getAccounts().size());
	}

}
