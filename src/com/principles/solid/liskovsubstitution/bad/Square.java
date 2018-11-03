package com.principles.solid.liskovsubstitution.bad;

public class Square extends Rectangle {

	@Override
	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
	
	@Override
	public void setWidth(int width) {
		super.setHeight(width);
		super.setWidth(width);
	}
}
