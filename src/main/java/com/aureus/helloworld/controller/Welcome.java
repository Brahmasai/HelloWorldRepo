package com.aureus.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@RequestMapping("/callResource")
	public String callResource() {
		return "Welcome To AureusTechSystems";
		
	}
	
	@RequestMapping("/")
	public String getStudent() {
		return "Welcome To AureusTechSystems";
	}
}
