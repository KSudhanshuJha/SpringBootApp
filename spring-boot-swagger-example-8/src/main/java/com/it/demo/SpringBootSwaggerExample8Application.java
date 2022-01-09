package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.it"})
public class SpringBootSwaggerExample8Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerExample8Application.class, args);
	}

}
