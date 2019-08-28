package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.LogType;
import com.techlabs.dip.violation.TaxCalculator;

public class DIPTest {

	public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator(LogType.XML);
		System.out.println(tc.calcTax(10, 0));
	}

}
