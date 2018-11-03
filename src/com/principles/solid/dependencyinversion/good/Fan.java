package com.principles.solid.dependencyinversion.good;

public class Fan implements SwitchableDevice {

	private boolean state = false;
	private int speed;

	@Override
	public void toggle() {
		if (state = !state) {
			this.turnOn();
		} else {
			this.turnOff();
		}
	}

	public void turnOn() {
		increaseSpeed();
		System.out.println("Fan turned on");
	}

	public void turnOff() {
		System.out.println("Fan turned off");
		speed = 0;
	}

	public void increaseSpeed() {
		speed++;
	}

	public void decreaseSpeed() {
		speed--;
	}

	public int getSpeed() {
		return speed;
	}

}
