package com.it.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = {"com.it"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopAfterAdviceExample3Application {

	public static void main(String[] args) {
		SpringApplication.run(AopAfterAdviceExample3Application.class, args);
	}

}
