package com.techlabs.composite.html;

public class Control implements IHTMLElement {
	private final String tag;
	private String type;
	private String value;
	private StringBuilder sb=new StringBuilder();
	public Control(String tag, String type, String id) {
		this.tag = tag;
		this.type=type;
		this.value = id;
	}
	
	public Control(String tag) {
		this.tag=tag;
	}
	@Override
	public StringBuilder parseHTML() {
		if(type==null) {
			System.out.println("<"+tag+">");
			return sb.append("<"+tag+">"+"\n");
		}
		System.out.println("<"+tag+" type = \""+type+"\" value = \""+value+"\">");
		return sb.append("<"+tag+" type = \""+type+"\" value = \""+value+"\">"+"\n");
	}

}
