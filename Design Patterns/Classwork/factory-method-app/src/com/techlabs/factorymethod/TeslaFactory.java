package com.techlabs.factorymethod;

public class TeslaFactory implements IAutoFactory{
	private static TeslaFactory instance;
	
	private TeslaFactory() {}
	
	public static TeslaFactory getInstance() {
		if(instance==null) {
			instance=new TeslaFactory();
		}
		return instance;
	}
	
	public IAutomobile make() {
		return new Tesla(); 
	}
	
}
