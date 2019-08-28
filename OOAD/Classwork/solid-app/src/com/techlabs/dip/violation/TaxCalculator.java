package com.techlabs.dip.violation;

public class TaxCalculator {
	LogType logType;

	public TaxCalculator(LogType logType) {
		this.logType = logType;
	}
	
	public int calcTax(int amount,int rate) {
		int result=-1;
		try {
			result=amount/rate;
		}catch(RuntimeException e) {
			if(logType==LogType.XML) {						//OCP Violation
				XMLLogger xmlLogger=new XMLLogger();
				xmlLogger.log(e.getMessage());
			}
			else if(logType==LogType.DB) {
				DBLogger dbLogger=new DBLogger();
				dbLogger.log(e.getMessage());
			}
		}
		return result;
	}
}
