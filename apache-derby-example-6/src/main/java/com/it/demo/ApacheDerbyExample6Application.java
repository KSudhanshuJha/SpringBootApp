package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.it","com.it.service","com.it.repository","com.it.controller"})
@EnableJpaRepositories("com.it.repository")
public class ApacheDerbyExample6Application {

	public static void main(String[] args) {
		SpringApplication.run(ApacheDerbyExample6Application.class, args);
	}

}
