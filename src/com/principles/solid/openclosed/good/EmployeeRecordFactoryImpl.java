package com.principles.solid.openclosed.good;

public class EmployeeRecordFactoryImpl implements EmployeeRecordFactory {

	@Override
	public EmployeeRecord makeEmployeeRecord(Employee e) throws InvalidEmployeeType {
		switch (e.getType()) {
		case COMMISSIONED:
			return new CommissionedEmployee(e);
		case HOURLY:
			return new HourlyEmployee(e);
		case SALARIED:
			return new SalariedEmploye(e);
		default:
			throw new InvalidEmployeeType(e.getType());
		}
	}

}
