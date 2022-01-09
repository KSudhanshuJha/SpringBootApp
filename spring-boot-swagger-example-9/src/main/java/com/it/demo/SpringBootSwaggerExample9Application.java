package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.it"})
public class SpringBootSwaggerExample9Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerExample9Application.class, args);
	}

}
