package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.it.model.Account;
import com.it.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/account")
	public String findAccountById(@RequestParam("accountId") String accountId) throws Exception {
		Account account=accountService.getAccountByCustomerId(accountId);
		if(null !=account) {
			return account.getAccountNumber() +"-" +account.getAccountType();
		}else {
			return "";
		}
		
	}

}
