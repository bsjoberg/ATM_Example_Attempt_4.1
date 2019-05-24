package nicebank;

import org.junit.Assert;

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
		helper.getMyAccount().credit(amount);
	}

	@Given("^I am account owner (\\d+) with a (\\$\\d+\\.\\d+) balance$")
	public void iAmAnAccountOwnerWithA$Balance(int accountNumber, @Transform(MoneyConverter.class) Money amount)
			throws Throwable {
		// User should enter their account
		helper.getMyBank().addAccount(new Account(accountNumber));
		helper.getMyBank().getAccount(2345).credit(amount);
	}

	@Then("^the balance of my account should be \\$(\\d+)\\.(\\d+)$")
	public void theBalanceOfMyAccountShouldBe$(int dollars, int cents) throws Throwable {
		Assert.assertEquals("Incorrect Account Balance", new Money(dollars, cents),
				helper.getMyAccount().getBalance());
	}

	@Then("^the balance of account (\\d+) should be \\$(\\d+)\\.(\\d+)$")
	public void theBalanceOfAccountShouldBe$(int accountNumber, int dollars, int cents) throws Throwable {
		Assert.assertEquals("Incorrect Account Balance", new Money(dollars, cents),
				helper.getMyBank().getAccount(accountNumber).getBalance());
	}
}