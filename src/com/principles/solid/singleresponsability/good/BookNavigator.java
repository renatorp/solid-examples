package com.principles.solid.singleresponsability.good;

public class BookNavigator {

	public BookNavigator(Book book) {
		
	}
	
	public void turnPage() {
		
	}
	
	public Page getCurrentPage() {
		return new Page();
	}
}
