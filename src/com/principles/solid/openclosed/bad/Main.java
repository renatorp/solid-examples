package com.principles.solid.openclosed.bad;

public class Main {

	public static void main(String[] args) throws InvalidEmployeeType {
		Payroll payroll = new Payroll();
		
		Employee e1 = new Employee("Arnstein Ostberg", EmployeeType.COMMISSIONED);
		Money payment = payroll.calculatePay(e1);
		System.out.println(e1.getName() + ": " + payment.getMoneyInfo());
		
		Employee e2 = new Employee("Kjersti Sylte", EmployeeType.HOURLY);
		Money payment2 = payroll.calculatePay(e2);
		System.out.println(e2.getName() + ": " + payment2.getMoneyInfo());
		
		Employee e3 = new Employee("Kjell Bjorge", EmployeeType.SALARIED);
		Money payment3 = payroll.calculatePay(e3);
		System.out.println(e3.getName() + ": " + payment3.getMoneyInfo());

	}
}
