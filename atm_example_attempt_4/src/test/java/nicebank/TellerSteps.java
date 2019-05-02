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
	    
	    helper.getTeller().withdrawFrom(helper.getMyAccount(), amount);
	}
}
