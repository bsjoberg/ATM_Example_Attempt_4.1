package nicebank;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
	ArrayList<Account> accounts = new ArrayList<Account>();

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public Account getAccount(int accountNumber) {
		Iterator<Account> iter = accounts.listIterator();
		while (iter.hasNext()) {
			if (iter.next().accountNumber() == accountNumber)
				return iter.next();
		}
		return null;
	}
}