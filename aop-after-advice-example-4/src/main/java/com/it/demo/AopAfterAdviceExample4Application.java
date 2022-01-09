package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.it.model.Account;
import com.it.service.AccountService;
import com.it.service.AccountServiceImpl;

@SpringBootApplication(scanBasePackages = { "com.it" })
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopAfterAdviceExample4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(AopAfterAdviceExample4Application.class, args);
		// Fetching the account object from the application context
		AccountService accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
		Account account;
		try {
			account = accountService.getAccountByCustomerId("K2434567");
			if (account != null)
				System.out.println(account.getAccountNumber() + "\t" + account.getAccountType());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
