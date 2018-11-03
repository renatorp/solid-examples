package com.principles.solid.dependencyinversion.bad;

public class Button {

	private Lamp lamp;
	private boolean state = false;
	
	public Button(Lamp lamp) {
		this.lamp = lamp;
	}

	public void toggle() {
		if (state = !state) {
			lamp.switchOn();
		} else {
			lamp.switchOff();
		}
	}
	
}
