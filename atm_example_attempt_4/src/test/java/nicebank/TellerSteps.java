package nicebank;

import cucumber.api.java.en.When;
import support.KnowsTheDomain;

public class TellerSteps {
	private KnowsTheDomain helper;
	
	public TellerSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	
	@When("^I withdraw \\$(\\d+)$")
	public void iWithdraw$(Integer amount) {
	    try {
			helper.getTeller().withdrawFrom(helper.getMyAccount(), amount);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
	}
	
	@When("^I check my balance for account (\\d+)$")
	public void iCheckMyBalanceForAccount(int accountNumber) throws Throwable {
	    helper.getMyBank().getAccount(accountNumber).getBalance();
	}
}
