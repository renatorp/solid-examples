package com.principles.solid.singleresponsability.good;

public class HTMLPrinter implements Printer {

	@Override
	public void printPage(Printable printable) {
		System.out.println("<div style=\"single-page\">" + printable.getContent() + "</div>");
	}

}
