package com.principles.solid.dependencyinversion.good;

public class Lamp implements SwitchableDevice{

	private boolean state = false;

	public void switchOn() {
		System.out.println("Lamp turned on");
	}

	public void switchOff() {
		System.out.println("Lamp turned off");
	}

	@Override
	public void toggle() {
		if (state = !state) {
			this.switchOn();
		} else {
			this.switchOff();
		}
		
	}

}
