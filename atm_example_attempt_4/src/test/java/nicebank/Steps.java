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
	
	@Given("^I have deposited \\$(\\d+)\\.(\\d+) in my account$")
	public void iHaveDeposited$InMyAccount(Integer dollars, Integer cents) {
	    Account myAccount = new Account();
	    myAccount.deposit(new Money(dollars, cents));
	    
	    Assert.assertEquals("Incorrect Account balance", new Money(dollars, cents), myAccount.getBalance());
	}

	@When("^I request \\$(\\d+)$")
	public void iRequest$(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
