package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	static final String MESSAGE = "Welcome to spring boot world...";
	
	@RequestMapping("/")
	public String helloMsg() {
		return MESSAGE;
	}

}
