package com.principles.solid.openclosed.good;

public abstract class EmployeeRecord {
	
	public abstract boolean isPayday();

	public abstract Money calculatePay();

	public abstract void deliverPay(Money pay);
	
}
