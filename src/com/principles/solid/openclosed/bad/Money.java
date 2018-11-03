package com.principles.solid.openclosed.bad;

public class Money {
	private Double value;
	
	public Money(Double value) {
		this.value = value;
	}
	
	public String getMoneyInfo() {
		return "Salary US$" + value;
	}
}
