package nicebank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoneyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_parse_string_to_Money() {
		String moneyAmount = "$100.10";
		Money money = Money.transform(moneyAmount);
		Assert.assertEquals(100, money.dollars());
		Assert.assertEquals(10, money.cents());
	}

}
