package com.techlabs.factorymethod;

public class Audi implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Audi is starting");
	}

	@Override
	public void stop() {
		System.out.println("Audi has stopped");
	}

}
