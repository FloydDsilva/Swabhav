package com.techlabs.strategy;

public class OperationAdd implements Strategy {

	@Override
	public double doOperation(int num1, int num2) {
		return num1+num2;
	}

}
