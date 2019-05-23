package nicebank;

import java.util.ArrayList;

public class Bank {
	ArrayList<Account> accounts = new ArrayList<Account>();

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}
}