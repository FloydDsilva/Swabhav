package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.TaxCalculator;
import com.techlabs.dip.solution.XMLLogger;

public class DIPTest {

	public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator(new XMLLogger());
		System.out.println(tc.calcTax(10, 0));
	}

}
