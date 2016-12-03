package cz.smonty.spring;

public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;
	
	/*
	tohle vubec nechapu. tady se to nejakou zahadou
	injektuje takze pak transfetMoney "vi" kde ma
	accountDAO
	
	aha, takze to chapu, ja to injektuju v te beane :D
	v BeanFactory, metoda accountService()
	*/
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public void transferMoney(long sourceAccoutId, long destinationAccountId, double amount) {
		Account source = this.accountDAO.findByAccountId(sourceAccoutId);
		Account destination = this.accountDAO.findByAccountId(destinationAccountId);
		
		this.accountDAO.updateBalance(source, -amount);
		this.accountDAO.updateBalance(destination, +amount);
	}
	
}
