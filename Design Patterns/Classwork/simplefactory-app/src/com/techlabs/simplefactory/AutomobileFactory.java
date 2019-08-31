package com.techlabs.simplefactory;

public class AutomobileFactory {
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
