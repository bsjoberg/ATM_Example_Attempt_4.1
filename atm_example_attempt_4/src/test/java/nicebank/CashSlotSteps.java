package nicebank;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import support.KnowsTheDomain;

public class CashSlotSteps {
	private KnowsTheDomain helper;
	
	public CashSlotSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}
	
	
	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) {
		Assert.assertEquals("Incorrect amount dispensed -", 
                dollars, helper.getCashSlot().getContents());
	}
	
}
