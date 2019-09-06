package com.techlabs.composite.html;

public class Control implements IHTMLElement {
	private final String tag;
	private  final String id;
	private final String type;
	public Control(String tag, String type, String id) {
		this.tag = tag;
		this.type=type;
		this.id = id;
	}


	@Override
	public void parseHTML() {
		System.out.println("<"+tag+" type = "+type+" name = "+id+">");
	}

}
