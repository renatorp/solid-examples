package com.principles.solid.openclosed.good;

public interface EmployeeRecordFactory {
	EmployeeRecord makeEmployeeRecord(Employee e) throws InvalidEmployeeType;
}
