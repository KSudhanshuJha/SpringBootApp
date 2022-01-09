package com.it.service;

import com.it.model.Account;

public interface AccountService {
	
	public Account getAccountByCustomerId(String customerId) throws Exception;

}
