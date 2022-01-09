package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.it.model.Employee;
import com.it.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired  
	private EmployeeService employeeService;  
	@GetMapping(value = "/addEmployee")  
	public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName)   
	{  
	return employeeService.createEmployee(empId, firstName, secondName);  
	}  
	@GetMapping(value = "/removeEmployee")  
	public String removeEmployee( @RequestParam("empId") String empId)   
	{  
	employeeService.deleteEmployee(empId);  
	return "Employee removed";  
	}  
}
