package nicebank;

import org.junit.Assert;
import org.junit.Test;

public class CheckoutUnitTest {

	@Test
	public void should_add_different_items_with_different_prices()
	{
		Checkout checkout = new Checkout();
		checkout.add(1, 30);
		checkout.add(1, 25);
		
		Assert.assertEquals(new Integer(55), checkout.total());
	}
	
}
