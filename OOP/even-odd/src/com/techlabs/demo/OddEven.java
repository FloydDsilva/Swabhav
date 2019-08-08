package com.techlabs.demo;

import java.util.ArrayList;

public class OddEven {

	private ArrayList<Integer> even=new ArrayList<Integer>();
	private ArrayList<Integer> odd=new ArrayList<Integer>();
	public void displayOddEven(int limit) {
		for(int num=1;num<=limit;num++) {
			if(checkEven(num)) {
				even.add(num);
			}
			else {
				odd.add(num);
			}
		}
		System.out.println("Even Numbers:");
		printArrayList(even);
		System.out.println();
		System.out.println("Odd Numbers:");
		printArrayList(odd);
	}

	public  ArrayList<Integer> getEven() {
		return even;
	}
	
	public void displayEven() {
		System.out.println("\nEven Numbers:");
		printArrayList(even);
	}
	
	public void displayOdd() {
		System.out.println("\nOdd Numbers:");
		printArrayList(odd);
	}
	
	public ArrayList<Integer> getOdd() {
		return even;
	}
	
	private void printArrayList(ArrayList<Integer> numbers) {
		for(int num:numbers) {
			System.out.print(num+" ");
		}
	}

	private boolean checkEven(int num) {
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
