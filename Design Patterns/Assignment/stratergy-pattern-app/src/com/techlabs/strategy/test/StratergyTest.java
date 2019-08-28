package com.techlabs.strategy.test;

import com.techlabs.strategy.Context;
import com.techlabs.strategy.OperationAdd;
import com.techlabs.strategy.OperationDivide;
import com.techlabs.strategy.OperationMultiply;
import com.techlabs.strategy.OperationSubtract;

public class StratergyTest {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationDivide());
		System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
		
	}

}
