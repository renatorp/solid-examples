package com.principles.solid.singleresponsability.good;

public class PlainTextPrinter implements Printer {

	@Override
	public void printPage(Printable printable) {
		System.out.println(printable.getContent());
	}

}
