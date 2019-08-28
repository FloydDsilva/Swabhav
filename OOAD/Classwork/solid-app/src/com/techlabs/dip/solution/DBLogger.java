package com.techlabs.dip.solution;

public class DBLogger implements ILoggable{
	public void log(String errMessage) {
		System.out.println("In DB Logger:"+errMessage);
	}
}
