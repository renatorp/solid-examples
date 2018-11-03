package com.principles.solid.interfacesegregation.good;

public class Eagle implements Flyable, Moltable {

	@Override
	public void fly() {
		System.out.println("Eagle flying.");
		
	}

	@Override
	public void molt() {
		System.out.println("Eagle molting.");
	}

}
