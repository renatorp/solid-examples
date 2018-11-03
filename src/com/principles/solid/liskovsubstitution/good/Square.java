package com.principles.solid.liskovsubstitution.good;

public class Square implements Shape {

	private int sideLength;

	public Square(int sideLength) {
		this.sideLength = sideLength;
	}

	public int getSideLength() {
		return sideLength;
	}

	@Override
	public int getArea() {
		return this.sideLength * this.sideLength;
	}

}
