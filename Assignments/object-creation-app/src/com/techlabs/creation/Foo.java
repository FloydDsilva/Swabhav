package com.techlabs.creation;

import java.io.Serializable;

public class Foo implements Cloneable,Serializable{
	private final String bar="Working!!";

	public String getBar() {
		return bar;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
