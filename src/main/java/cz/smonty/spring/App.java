package cz.smonty.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(BeanFactory.class);
		AccountService service = context.getBean("myAccountService", AccountService.class);
		AccountDAO dao = context.getBean("myAccountDao", AccountDAO.class);
		
		dao.printAllAccounts();
		
		service.transferMoney(1, 2, 500);
		
		dao.printAllAccounts();
	}
	
}
