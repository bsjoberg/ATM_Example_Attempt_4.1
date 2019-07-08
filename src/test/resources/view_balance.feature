Feature: View Balance
	Scenario: View small balance at an ATM
		Given I am account owner 2345 with a $100.00 balance
		When I check my balance for account 2345
		Then the balance of account 2345 should be $100.00