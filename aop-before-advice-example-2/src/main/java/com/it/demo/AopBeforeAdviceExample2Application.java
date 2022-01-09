package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = {"com.it"})
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class AopBeforeAdviceExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(AopBeforeAdviceExample2Application.class, args);
	}

}
