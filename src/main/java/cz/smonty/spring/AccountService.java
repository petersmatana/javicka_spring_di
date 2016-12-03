package cz.smonty.spring;

public interface AccountService {

	public void transferMoney(long sourceAccoutId, long destinationAccountId, double amount);

}
