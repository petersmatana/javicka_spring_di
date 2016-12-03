package cz.smonty.spring;

import java.util.LinkedList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

	private List<Account> allAccounts;

	public AccountDAOImpl() {
		this.allAccounts = new LinkedList<Account>();
		init();
	}

	private void init() {
		if (this.allAccounts != null) {
			Account a1 = new Account();
			a1.setId(1);
			a1.setBalance(2000);
			a1.setOwnerName("smonty");

			this.insert(a1);

			Account a2 = new Account();
			a2.setId(1);
			a2.setBalance(5000);
			a2.setOwnerName("pepa");

			this.insert(a2);
		}
	}

	public void insert(Account account) {
		if (this.allAccounts != null && account != null) {
			this.allAccounts.add(account);
		}
	}

	public Account findByAccountId(long id) {
		if (this.allAccounts != null) {
			for (Account account : this.allAccounts) {
				if (account.getId() == id) {
					return account;
				}
			}
		}
		return null;
	}

	public void updateBalance(Account account, double newBalance) {
		if (this.allAccounts != null && account != null) {
			for (Account a : this.allAccounts) {
				if (a.getId() == account.getId()) {
					a.setBalance(a.getBalance() + newBalance);
				}
			}
		}
	}
	
	public void printAllAccounts() {
		if (this.allAccounts != null) {
			for (Account account : this.allAccounts) {
				System.out.println(account.toString());
			}
		}
	}

}
