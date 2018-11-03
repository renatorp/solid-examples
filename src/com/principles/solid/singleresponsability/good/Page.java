package com.principles.solid.singleresponsability.good;

public class Page implements Printable {

	@Override
	public String getContent() {
		return "A page that deverves printing.";
	}

}
