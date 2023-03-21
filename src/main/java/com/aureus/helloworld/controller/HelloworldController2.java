package com.aureus.helloworld.controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aureus.helloworld.model.Employee;

@RestController
public class HelloworldController {

	@GetMapping("/call")
	public String callResources() {
		return "Welcome to Aureus Family!";
	}
	
	@RequestMapping(value ="/employee", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
			,consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		return new Employee(1, "sai", "softwareEngineer", "Dev");
		
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(2, "Ravi", "Engineer", "HR"));
		empList.add(new Employee(3, "Shiva", "architech", "Development"));
		empList.add(new Employee(4, "Sai", "SR Dev", "Devlopment"));
		return empList;
		
	}
	
	@GetMapping("/call")
	public String getEmpName() {
		return "Hello sai";
	}
}
