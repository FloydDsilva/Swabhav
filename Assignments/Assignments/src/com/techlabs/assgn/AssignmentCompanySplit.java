package com.techlabs.assgn;

public class AssignmentCompanySplit {
	public static void main(String[] args) {
		String input="http://www.aurionprosolution.com?programmer=abc";
		String[] company_split=input.split("\\.");
		String company=company_split[1];
		String[] coder_split=input.split("=");
		String coder;
		if(coder_split.length==1) {
			coder="";
		}
		else {
			coder=coder_split[1];
		}
		System.out.println("Input:"+input);
		System.out.println("Company:"+company);
		System.out.println("Coder:"+coder);
	}
}
