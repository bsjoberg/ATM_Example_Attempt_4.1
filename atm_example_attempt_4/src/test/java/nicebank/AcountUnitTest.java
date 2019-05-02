package nicebank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AcountUnitTest {
	private Account account;
	
	@Before
	public void setUp() throws Exception {
		account = new Account();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_should_be_able_to_add_funds_using_Money() {	
		account.deposit(new Money(100,0));
		
		Assert.assertEquals("Incorrect Balance", new Money (100, 0), account.getBalance());
	}
	
	@Test
	public void test_should_be_able_to_add_funds_using_String() {
		
	}
	
	@Test
	public void test_should_be_able_to_add_funds_using_integer() {
		
	}
}