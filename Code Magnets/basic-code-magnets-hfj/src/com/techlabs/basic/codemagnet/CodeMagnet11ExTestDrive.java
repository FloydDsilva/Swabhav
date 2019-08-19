package com.techlabs.basic.codemagnet;
class MyEx extends Exception{}
public class CodeMagnet11ExTestDrive {

	public static void main(String[] args) {
		String test ="no";
		try {
			System.out.println("t");
			System.out.println("h");
			doRisky(test);
			System.out.println("r");
			System.out.println("o");
		}
		catch (MyEx e) {
			System.out.println("a");
		}
		finally {
			System.out.println("w");
			System.out.println("s");
		}
	}

	static void doRisky(String t) throws MyEx{
		if("yes".equals(t)) {
			throw new MyEx();
		}
		
	}
	
	

}
