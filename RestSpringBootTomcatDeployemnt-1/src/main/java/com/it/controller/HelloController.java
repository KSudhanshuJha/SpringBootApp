package com.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final String HELLO_MSG="Hello User, have a nice day.";
	
	@RequestMapping("/hello")
	public String helloMsg() {
		return HELLO_MSG;
	}

}
