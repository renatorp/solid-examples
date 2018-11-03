package com.principles.solid.interfacesegregation.good;

public class Penguin implements Swimmable, Moltable {

	@Override
	public void molt() {
		System.out.println("Penguin molting");
	}

	public void swim() {
		System.out.println("Penguin swimming");
	}

}
