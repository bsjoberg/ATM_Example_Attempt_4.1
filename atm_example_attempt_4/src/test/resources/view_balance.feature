Feature: View Balance
	Scenario: View small balance at an ATM
		Given I am an account owner with a $100.00 balance
		When I check my balance
		Then the balance of my account should be $100.00