package cz.smonty.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
anotace @Configuration rika springu ze tato trida obsahuje
metadata (dal to zdroj nerozvadi :( ). Pak tu mam @Bean
kterou vola sprin na zacatku aplikace a v main metode je
injektuje. 
*/

@Configuration
public class BeanFactory {

	@Bean(name = "myAccountService")
	public AccountService accountService() {
		AccountServiceImpl service = new AccountServiceImpl();
		service.setAccountDAO(accountDao());
		return service;
	}

	@Bean(name = "myAccountDao")
	public AccountDAOImpl accountDao() {
		AccountDAOImpl accountDAO = new AccountDAOImpl();
		return accountDAO;
	}

}
