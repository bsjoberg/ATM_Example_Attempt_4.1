package nicebank;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	private Inventory inventory = new Inventory();
	private Checkout checkout = new Checkout(inventory);

	@Given("the price of a(n) {string} is {int}c")
	public void thePriceOfAIsC(String name, Integer price) {
	    inventory.add(name, price);
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer itemCount, String itemName) {
	    checkout.add(itemCount, itemName);
	}

	@Then("the total price should be {int}c")
	public void theTotalPriceShouldBeC(Integer total) {
	    Assert.assertEquals(total, checkout.total());
	}
}
