package com.principles.solid.dependencyinversion.good;

public class Main {
	public static void main(String[] args) {
		SwitchableDevice l = new Lamp();
		Button button = new Button(l);
		
		button.toggle();
		button.toggle();
		button.toggle();
		
		System.out.println();
		
		
		Fan fan = new Fan();
		Button buttonF = new Button(fan);
		
		buttonF.toggle();
		fan.increaseSpeed();
		fan.increaseSpeed();
		System.out.println("Speed: " + fan.getSpeed());
		
		buttonF.toggle();
		System.out.println("Speed: " + fan.getSpeed());
		
		buttonF.toggle();
		System.out.println("Speed: " + fan.getSpeed());
	}
}
