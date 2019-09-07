package com.techlabs.composite.html.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		div.addControl(new Control("br"));
		div.addControl(new Control("br"));
		div.addControl(new Control("input", "text","LastName"));
		
		StringBuilder sb=html.parseHTML();
		
		File file = new File("C:\\Users\\Floyd\\Desktop\\htmltest.html");
		try(BufferedWriter writer=new BufferedWriter(new FileWriter(file))){
			writer.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
