package com.principles.solid.openclosed.good;

public class SalariedEmploye extends EmployeeRecord {

	public SalariedEmploye(Employee e) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPayday() {
		return false;
	}

	@Override
	public Money calculatePay() {
		return new Money(4000d);
	}

	@Override
	public void deliverPay(Money pay) {
	}

}
