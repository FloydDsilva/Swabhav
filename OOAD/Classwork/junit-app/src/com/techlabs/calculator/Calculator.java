package com.techlabs.calculator;

import com.techlabs.exeptions.NegativeNumberException;
import com.techlabs.exeptions.OddNumberException;

public class Calculator extends RuntimeException{
	public int add(int number1,int number2) {
		if((number1>=0)&&(number2>=0)) {
			return number1+number2;
		}
		throw new NegativeNumberException("Do not add negative numbers");
	}
	
	public int evenCube(int number) {
		if(number%2==0) {
			return number*number*number;
		}
		throw new OddNumberException("Do not add odd number");
	}
}
