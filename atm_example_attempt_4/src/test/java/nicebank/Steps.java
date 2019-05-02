package nicebank;

import org.junit.Assert;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import transforms.MoneyConverter;

public class Steps {
	KnowsMyAccount helper;
	
	public Steps() {
		helper = new KnowsMyAccount();
	}
	
	class KnowsMyAccount {
		private Account myAccount;
	
		public Account getMyAccount() {
			if (myAccount == null)
				myAccount = new Account();
			
			return myAccount;
		}
	}
		
	class Account {
		private Money balance = new Money();
		
		public void deposit(Money amount) {
			balance = balance.add(amount);
		}

		public Money getBalance() {
			return balance;
		}
		

	}
	
	class Teller {
		public void withdrawFrom(Account account, int dollars) {
			
		}
	}
	
	@Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
	public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
	    helper.getMyAccount().deposit(amount);
	    
	    Assert.assertEquals("Incorrect Account balance", amount, helper.getMyAccount().getBalance());
	}

	@When("^I withdraw \\$(\\d+)$")
	public void iWithdraw$(Integer amount) {
	    Teller teller = new Teller();
	    teller.withdrawFrom(helper.getMyAccount(), amount);
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
