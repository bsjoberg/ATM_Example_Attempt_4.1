package nicebank;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	class Account {
		private Money balance = new Money();
		
		public void deposit(Money amount) {
			balance.add(amount);
		}

		public Money getBalance() {
			return balance;
		}
	}
	
	@Given("I have deposited ${money} in my account")
	public void iHaveDeposited$InMyAccount(Money amount) {
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
