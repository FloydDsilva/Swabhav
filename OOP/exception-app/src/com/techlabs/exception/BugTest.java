package com.techlabs.exception;

public class BugTest {

	public static void main(String[] args) {
		try {
			int a =Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("Result is "+c);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Values are not provided");
		}
		catch (NumberFormatException e) {
			System.out.println("Input Numbers");
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot be Divided by Zero");
		}
		finally {
			System.out.println("Thank you!!");
		}
		
	}
}
