package com.techlabs.factorymethod;

public class AudiFactory implements IAutoFactory{
	private static AudiFactory instance;
	
	private AudiFactory() {}
	
	public static AudiFactory getInstance() {
		if(instance==null) {
			instance=new AudiFactory();
		}
		return instance;
	}
	
	@Override
	public IAutomobile make() {
		return new Audi();
	}
	
}
