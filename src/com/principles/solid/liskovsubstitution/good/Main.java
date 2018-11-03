package com.principles.solid.liskovsubstitution.good;


public class Main {
	public static void main(String[] args) {
		Shape rec = new Rectangle(15, 20);
		verifyShape(rec);
		
		Shape sq = new Square(20);
		verifyShape(sq);
	}

	private static void verifyShape(Shape rec) {
		System.out.println("Area: " + rec.getArea());
	}
}
