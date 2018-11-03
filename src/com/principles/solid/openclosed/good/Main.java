package com.principles.solid.openclosed.good;


public class Main {
	
	public static void main(String[] args) throws InvalidEmployeeType {
		EmployeeRecordFactory factory = new EmployeeRecordFactoryImpl();
		
		Employee e1 = new Employee("Arnstein Ostberg", EmployeeType.COMMISSIONED);
		EmployeeRecord employeeRecord = factory.makeEmployeeRecord(e1);
		
		Employee e2 = new Employee("Kjersti Sylte", EmployeeType.HOURLY);
		EmployeeRecord employeeRecord2 = factory.makeEmployeeRecord(e2);
		
		Employee e3 = new Employee("Kjell Bjorge", EmployeeType.SALARIED);
		EmployeeRecord employeeRecord3 = factory.makeEmployeeRecord(e3);

		System.out.println(e1.getName() + ": " + employeeRecord.calculatePay().getMoneyInfo());
		System.out.println(e2.getName() + ": " + employeeRecord2.calculatePay().getMoneyInfo());
		System.out.println(e3.getName() + ": " + employeeRecord3.calculatePay().getMoneyInfo());
	}
}
