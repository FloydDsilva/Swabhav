package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.Invoice;
import com.techlabs.srp.solution.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invSachin=new Invoice("1", "Sachin", 100, 10);
		InvoicePrinter invPrint=new InvoicePrinter();
		invPrint.print(invSachin);
	}

}
