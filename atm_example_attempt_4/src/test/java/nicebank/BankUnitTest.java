package nicebank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class BankUnitTest {
	private Bank bank;
	
	@Before
	public void setUp() throws Exception {
		bank = new Bank();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_has_one_Account() {
		Account accountMock = Mockito.mock(Account.class);
		bank.addAccount(accountMock);
		Assert.assertEquals(1, bank.getAccounts().size());
	}
	
	@Test 
	public void test_check_balance() {
		Account accountMock = Mockito.mock(Account.class);
		Mockito.when(accountMock.getBalance()).thenReturn(new Money("$50.00"));
		Mockito.when(accountMock.accountNumber()).thenReturn(1111);
		bank.addAccount(accountMock);
		Assert.assertEquals(new Money("$50.00"), bank.getAccount(1111).getBalance());
	}
}
