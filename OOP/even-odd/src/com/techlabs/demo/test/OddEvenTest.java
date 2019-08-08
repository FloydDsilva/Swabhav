package com.techlabs.demo.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.demo.OddEven;

public class OddEvenTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int limit =sc.nextInt();
		OddEven oddeven=new OddEven();
		oddeven.displayOddEven(limit);
		//ArrayList<Integer> even=oddeven.getEven();  to get Even array or Odd array
		oddeven.displayEven();
		oddeven.displayOdd();
	}
}
