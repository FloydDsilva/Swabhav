package com.techlabs.composite.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHTMLElement {
	private final String tag;
	private String id;
	private List<IHTMLElement> controls=new ArrayList<IHTMLElement>();;
	private StringBuilder sb=new StringBuilder();
	
	public ControlGroup(String tag) {
		this.tag = tag;
	}

	public ControlGroup(String tag,String id) {
		this.tag = tag;
		this.id=id;
	}
	
	public void addControl(IHTMLElement element) {
		controls.add(element);
	}
	
	@Override
	public StringBuilder parseHTML() {
		sb.append("<"+tag+">"+"\n");
		System.out.println("<"+tag+">");
		for (IHTMLElement control : controls) {
			sb.append(control.parseHTML());
		}
		System.out.println("</"+tag+">");
		sb.append("</"+tag+">"+"\n");
		return sb;
	}

	public String getTag() {
		return tag;
	}

}
