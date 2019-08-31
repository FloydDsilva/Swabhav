package com.techlabs.service;

public class DataService {
	
	private static DataService bucket;
	
	private DataService() {
		System.out.println("Service created!");
	}
	
	public static DataService getInstance() {
		if(bucket==null) {
			bucket=new DataService();
		}
		return bucket;
	}
	  
	public void processData() {
		System.out.println("Data being processed "+this.hashCode());
	}
	
	
}
