Feature: Cash withdrawal
	Scenario: Successful withdrawal from an account in credit
		Given I have deposited $100.00 in my account
		When I withdraw $20
		Then $20 should be dispensed
		
	Scenario: Insufficient funds in account
		Given I have deposited $50.00 in my account
		When I withdraw $100
		Then $0 should be dispensed
		And I should be told the reason money was not dispensed