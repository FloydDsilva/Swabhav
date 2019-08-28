package com.techlabs.dip.solution;

public class XMLLogger implements ILoggable{
	public void log(String errMessage) {
		System.out.println("In XML Logger:"+ errMessage);
	}
}
