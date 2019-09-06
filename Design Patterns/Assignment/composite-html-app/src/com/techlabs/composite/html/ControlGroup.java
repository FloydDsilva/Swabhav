package com.techlabs.composite.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHTMLElement {
	private final String tag;
	private String id;
	private List<IHTMLElement> controls;
	
	public ControlGroup(String tag) {
		this.tag = tag;
		controls=new ArrayList<IHTMLElement>();
	}

	public ControlGroup(String tag,String id) {
		this.tag = tag;
		this.id=id;
		controls=new ArrayList<IHTMLElement>();
	}
	
	public void addControl(IHTMLElement element) {
		controls.add(element);
	}
	
	@Override
	public void parseHTML() {
		System.out.println("<"+tag+">");
		for (IHTMLElement control : controls) {
			control.parseHTML();
		}
		System.out.println("</"+tag+">");
	}

	public String getTag() {
		return tag;
	}

}
