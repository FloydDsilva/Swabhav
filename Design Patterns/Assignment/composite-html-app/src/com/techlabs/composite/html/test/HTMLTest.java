package com.techlabs.composite.html.test;

import com.techlabs.composite.html.Control;
import com.techlabs.composite.html.ControlGroup;

public class HTMLTest {

	public static void main(String[] args) {
		ControlGroup html=new ControlGroup("html");
		ControlGroup body=new ControlGroup("body");
		ControlGroup div=new ControlGroup("div");
		html.addControl(body);
		body.addControl(div);
		div.addControl(new Control("input", "text","FirstName"));
		div.addControl(new Control("input", "text","LastName"));
		
		html.parseHTML();
	}

}
