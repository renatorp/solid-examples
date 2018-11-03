package com.principles.solid.singleresponsability.bad;

public class Book {

	public String getTitle() {
		return "The Book";
	}
	
	public String getAuthor() {
		return "Someone important";
	}
	
	public void turnPage() {
		// Passa para próxima página.
	}
	
	public void printCurrentPage() {
		System.out.println("Current page content");
	}
}
