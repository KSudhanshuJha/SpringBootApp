package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.it"})
public class RestSpringBootTomcatDeployemnt1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringBootTomcatDeployemnt1Application.class, args);
	}

}
