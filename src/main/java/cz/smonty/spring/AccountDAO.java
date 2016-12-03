package cz.smonty.spring;

public interface AccountDAO {

	public void insert(Account account);
	public void updateBalance(Account account, double newBalance);
	public Account findByAccountId(long id);
	public void printAllAccounts();
	
}
