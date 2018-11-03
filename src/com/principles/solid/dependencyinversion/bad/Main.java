package com.principles.solid.dependencyinversion.bad;

public class Main {
	public static void main(String[] args) {
		Lamp l = new Lamp();
		Button button = new Button(l);
		
		button.toggle();
		button.toggle();
		button.toggle();
	}
}
