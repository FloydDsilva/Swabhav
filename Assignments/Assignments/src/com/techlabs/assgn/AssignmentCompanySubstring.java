package com.techlabs.assgn;

public class AssignmentCompanySubstring {
	public static void main(String[] args) {
		String input="http://www.aurionprosolution.com?programmer=abc";
		
		String company=input.substring((input.indexOf('.')+1),(input.lastIndexOf('.')));
		String coder=input.substring((input.indexOf('=')+1));
		input.
		System.out.println("Input:"+input);
		System.out.println("Company:"+company);
		System.out.println("Coder:"+coder);
	}

}
