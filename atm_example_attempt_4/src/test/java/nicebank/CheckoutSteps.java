package nicebank;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	private Integer bananaPrice = 0;
	private Checkout checkout;

	@Given("the price of a {string} is {int}c")
	public void thePriceOfAIsC(String name, Integer price) {
	    bananaPrice = price;
	    checkout = new Checkout();
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer itemCount, String itemName) {
	    checkout.add(itemCount, bananaPrice);
	}

	@Then("the total price should be {int}c")
	public void theTotalPriceShouldBeC(Integer total) {
	    Assert.assertEquals(total, checkout.total());
	}

}
