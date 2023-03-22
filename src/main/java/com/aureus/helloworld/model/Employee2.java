package com.aureus.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	
	private int id;
	private String name;
	private String desingantion;
	private String dept;
	
	public Employee(int id, String name, String desingantion, String dept) {
		this.id=id;
		this.name=name;
		this.desingantion=desingantion;
		this.dept=dept;
		
	}
	
}
