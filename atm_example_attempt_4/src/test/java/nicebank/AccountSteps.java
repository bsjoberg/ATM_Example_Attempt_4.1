package nicebank;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

public class AccountSteps {

	KnowsTheDomain helper;

	public AccountSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}

	@Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
	public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
		helper.getMyAccount().deposit(amount);

		Assert.assertEquals("Incorrect Account balance", amount, helper.getMyAccount().getBalance());
	}

	@Then("^the balance of my account should be \\$(\\d+)\\.(\\d+)$")
	public void theBalanceOfMyAccountShouldBe$(int dollars, int cents) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}