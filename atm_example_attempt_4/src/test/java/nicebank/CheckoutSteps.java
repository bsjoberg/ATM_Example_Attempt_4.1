package nicebank;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	@Given("the price of a {string} is {int}c")
	public void thePriceOfAIsC(String name, Integer price) {
	    int bananaPrice = price;
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer itemCount, String itemName) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the total price should be {int}c")
	public void theTotalPriceShouldBeC(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}