package com.techlabs.dip.solution;

public class TaxCalculator {
	private final ILoggable logger;
	public TaxCalculator(ILoggable logger) {
		this.logger = logger;
	}
	
	public int calcTax(int amount,int rate) {
		int result=-1;
		try {
			result=amount/rate;
		}catch(RuntimeException e) {
			logger.log(e.getMessage());
			throw e;
		}
		return result;
	}
}
