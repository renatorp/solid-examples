package com.principles.solid.interfacesegregation.bad;

public class Penguin implements Bird {

	@Override
	public void fly() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void molt() {
		System.out.println("Penguin molting");
	}
	
	public void swim() {
		System.out.println("Penguin swimming");
	}

}
