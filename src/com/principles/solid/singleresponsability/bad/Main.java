package com.principles.solid.singleresponsability.bad;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		book.turnPage();
		book.printCurrentPage();
	}
}
