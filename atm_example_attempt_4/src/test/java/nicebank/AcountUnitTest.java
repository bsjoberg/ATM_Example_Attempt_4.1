package nicebank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AcountUnitTest {
	private Account account;
	
	@Before
	public void setUp() throws Exception {
		account = new Account(1234);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_should_be_able_to_add_funds_using_Money() {	
		account.credit(new Money(100,0));
		
		Assert.assertEquals("Incorrect Balance", new Money (100, 0), account.getBalance());
	}
		
	@Test
	public void test_should_not_be_able_to_add_a_negative_amount() {
		account.credit(new Money(-100, 0));
		Assert.assertEquals("Incorrect Balance", new Money (0, 0), account.getBalance());
	}
	
	@Test
	public void test_should_be_able_to_withdraw_when_sufficient_funds_available() {
		account.credit(new Money(200,0));
		try {
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals("Incorrect Balance", new Money(100,0), account.getBalance());
	}

	@Test 
	public void test_account_should_be_4_numbers_long() {
		Assert.assertEquals(1234, account.accountNumber());
	}
	
	@Test 
	public void test_account_has_a_PIN() {
		account.setPIN(1234);
		Assert.assertEquals(1234, account.PIN());
	}
	
	@Test 
	public void test_change_PIN() {
		account.setPIN(2345);
		Assert.assertEquals(2345, account.PIN());
	}
}

