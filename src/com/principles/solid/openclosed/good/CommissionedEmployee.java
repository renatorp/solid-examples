package com.principles.solid.openclosed.good;

public class CommissionedEmployee extends EmployeeRecord {

	public CommissionedEmployee(Employee e) {
	}

	@Override
	public boolean isPayday() {
		return false;
	}

	@Override
	public Money calculatePay() {
		return new Money(10000d);
	}

	@Override
	public void deliverPay(Money pay) {
	}

}
