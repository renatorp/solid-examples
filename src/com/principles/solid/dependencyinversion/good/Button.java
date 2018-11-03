package com.principles.solid.dependencyinversion.good;

public class Button {

	private SwitchableDevice switchableDevice;
	
	public Button(SwitchableDevice switchableDevice) {
		this.switchableDevice = switchableDevice;
	}

	public void toggle() {
		switchableDevice.toggle();
	}
	
}
