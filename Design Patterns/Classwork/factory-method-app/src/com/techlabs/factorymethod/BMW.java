package com.techlabs.factorymethod;

public class BMW implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMW is starting");
	}

	@Override
	public void stop() {
		System.out.println("BMW has stopped");
	}

}
