package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.it"})
public class SpringBootSwaggerExample7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerExample7Application.class, args);
	}

}
