package com.principles.solid.singleresponsability.good;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		
		Page secondPage = getSecondPage(book);
		
		printPlain(secondPage);
		
		printHTML(secondPage);
	}

	private static void printHTML(Page secondPage) {
		Printer printer = new HTMLPrinter();
		printer.printPage(secondPage);
	}

	private static void printPlain(Page secondPage) {
		Printer printerPlain = new PlainTextPrinter();
		printerPlain.printPage(secondPage);
	}

	private static Page getSecondPage(Book book) {
		BookNavigator bookNavigator = new BookNavigator(book);
		
		bookNavigator.turnPage();
		bookNavigator.turnPage();
		
		return  bookNavigator.getCurrentPage();
	}
}
