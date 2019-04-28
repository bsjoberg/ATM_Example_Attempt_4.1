package nicebank;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CheckoutUnitTest {

	@Test
	public void should_add_different_items_with_different_prices()
	{
		Inventory inventoryMock = Mockito.mock(Inventory.class);
		try {
			Mockito.when(inventoryMock.priceOf("banana")).thenReturn(30);
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Mockito.when(inventoryMock.priceOf("apple")).thenReturn(25);
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}
		
		Checkout checkout = new Checkout(inventoryMock);
		checkout.add(1, "banana");
		checkout.add(1, "apple");
		
		Assert.assertEquals(new Integer(55), checkout.total());
	}
	
}
