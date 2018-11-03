package com.principles.solid.openclosed.good;

public class Employee {

	private String name;
	private EmployeeType type;

	public Employee(String name, EmployeeType type) {
		this.name = name;
		this.type = type;
	}

	public EmployeeType getType() {
		return type;
	}

	public String getName() {
		return name;
	}
}
