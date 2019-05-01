package nicebank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_add_item_check_price() {
		Inventory inventory = new Inventory();
		inventory.add("banana", 50);
		try {
			Assert.assertEquals(new Integer(50), inventory.priceOf("banana"));
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_add_two_different_items_with_different_prices()
	{
		Inventory inventory = new Inventory();
		inventory.add("banana", 50);
		inventory.add("apple", 23);
		
		try {
			Assert.assertEquals(new Integer(50), inventory.priceOf("banana"));
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Assert.assertEquals(new Integer(23), inventory.priceOf("apple"));
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test_add_item_but_misspelled() {
		Inventory inventory = new Inventory();
		inventory.add("banana", 35);
		
		try {
			inventory.priceOf("banan");
		} catch (ItemNotFoundException e) {
			Assert.assertNotNull(e);
		}
	}

	@Test
	public void test_update_price_of_existing_item() {
		
	}
}