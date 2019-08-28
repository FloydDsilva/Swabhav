package com.techlabs.strategy;

public class OperationMultiply implements Strategy {

	@Override
	public double doOperation(int num1, int num2) {
		return num1*num2;
	}

}
