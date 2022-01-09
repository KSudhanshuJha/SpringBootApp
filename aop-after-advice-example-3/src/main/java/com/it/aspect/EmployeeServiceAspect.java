package com.it.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeServiceAspect {
	
	@After(value = "execution(* com.it.service.EmployeeService.*(..)) and args(empId, fname, sname)")  
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
	System.out.println("Before method:" + joinPoint.getSignature());  
	System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
	}  

}
