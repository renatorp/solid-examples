package com.principles.solid.openclosed.bad;

public class Payroll {

	/**
	 * First, it’s large, and when new employee types are added, it will grow
	 * 
	 * Second, it very clearly does more than one thing.
	 *  
	 * Third, it violates the  Single Responsibility Principle (SRP) because there is more than 
	 * one reason for it to change.
	 * 
	 * Fourth, it violates the Open Closed Principle (OCP) because it must change whenever 
	 * new types are added.
	 * 
	 * But possibly the worst problem with this function is that there are an unlimited number 
	 * of other functions that will have the same structure. For example we could have 
	 * isPayday(Employee e, Date date),
	 * or
	 * deliverPay(Employee e, Money pay),
	 * or a host of others. 
	 * All of which would have the same deleterious structure.
	 */
	public Money calculatePay(Employee e) throws InvalidEmployeeType {
		switch (e.getType()) {
		case COMMISSIONED:
			return calculateCommissionedPay(e);
		case HOURLY:
			return calculateHourlyPay(e);
		case SALARIED:
			return calculateSalariedPay(e);
		default:
			throw new InvalidEmployeeType(e.getType());
		}
	}

	private Money calculateSalariedPay(Employee e) {
		return new Money(4000d);
	}

	private Money calculateHourlyPay(Employee e) {
		return new Money(5000d);
	}

	private Money calculateCommissionedPay(Employee e) {
		return new Money(10000d);
	}
}
