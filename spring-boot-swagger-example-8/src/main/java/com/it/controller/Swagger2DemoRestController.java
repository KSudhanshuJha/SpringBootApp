package com.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Swagger2DemoRestController {

	@GetMapping("/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
}
