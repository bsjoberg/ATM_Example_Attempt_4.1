package nicebank;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	class Account {
		private Double balance = 0.0;
		
		public void deposit(Double amount) {
			balance += amount;
		}

		public Double getBalance() {
			return balance;
		}
	}
	
	@Given("I have deposited ${double} in my account")
	public void iHaveDeposited$InMyAccount(Double amount) {
	    Account myAccount = new Account();
	    myAccount.deposit(amount);
	    
	    Assert.assertEquals("Incorrect Account balance", amount, myAccount.getBalance());
	}

	@When("I request ${int}")
	public void iRequest$(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("${int} should be dispensed")
	public void $ShouldBeDispensed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
