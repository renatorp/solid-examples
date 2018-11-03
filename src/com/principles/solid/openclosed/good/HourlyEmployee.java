package com.principles.solid.openclosed.good;

public class HourlyEmployee extends EmployeeRecord {

	public HourlyEmployee(Employee e) {
	}

	@Override
	public boolean isPayday() {
		return false;
	}

	@Override
	public Money calculatePay() {
		return new Money(5000d);
	}

	@Override
	public void deliverPay(Money pay) {
	}

}
