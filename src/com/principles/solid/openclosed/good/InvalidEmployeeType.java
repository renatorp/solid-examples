package com.principles.solid.openclosed.good;

public class InvalidEmployeeType extends Exception {
	private static final long serialVersionUID = -1984722577610757157L;

	public InvalidEmployeeType(EmployeeType type) {
		super("Invalid type " + type);
	}
}
