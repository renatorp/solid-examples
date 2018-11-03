package com.principles.solid.liskovsubstitution.bad;

public class Main {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		verifyRectangle(rec);
		
		Rectangle sq = new Square();
		verifyRectangle(sq);
	}

	private static void verifyRectangle(Rectangle rec) {
		rec.setHeight(15);
		rec.setWidth(20);
		System.out.println("Area: " + rec.getArea() + " <-> " + (15 * 20));
	}
}
