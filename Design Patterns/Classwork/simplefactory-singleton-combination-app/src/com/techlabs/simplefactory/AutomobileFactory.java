package com.techlabs.simplefactory;

public class AutomobileFactory {
	private static AutomobileFactory instance;
	
	private AutomobileFactory() {
		
	}
	
	public static AutomobileFactory getInstance() {
		if(instance==null) {
			instance=new AutomobileFactory();
		}
		return instance;
	}
	
	public IAutomobile make(AutoType type) {
		if(type==AutoType.BWM) {
			return new BMW();
		}
		if(type==AutoType.AUDI) {
			return new Audi();
		}
		return new Tesla(); 
	}
}
