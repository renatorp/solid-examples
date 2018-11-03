package com.principles.solid.interfacesegregation.bad;

public class Eagle implements Bird {

	@Override
	public void fly() {
		System.out.println("Eagle flying.");
		
	}

	@Override
	public void molt() {
		System.out.println("Eagle molting.");
	}

}
