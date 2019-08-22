package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.calculator.Calculator;
import com.techlabs.exeptions.NegativeNumberException;
import com.techlabs.exeptions.OddNumberException;

class CalculatorJUnitTest {
	Calculator calculator=new Calculator();
	
	@Rule 
	public ExpectedException thrown=ExpectedException.none();
	
	@Test
	void testAdd_PositiveNumbersWillBeAdded() {
		assertEquals(20, calculator.add(15, 5));
		assertEquals(10, calculator.add(5, 5));
	}
	
	@Test
	void testAdd_NegativeNumbersShouldThrowError() {
		assertThrows(NegativeNumberException.class,() ->{ calculator.add(-15, 5);});
		assertThrows(NegativeNumberException.class,() ->{ calculator.add(5, -5);});
		assertThrows(NegativeNumberException.class, ()->{calculator.add(-5, -5);});
	}
	
	@Test
	void testEvenCube_EvenNumbersWillBeCubed() {
		assertEquals(64, calculator.evenCube(4));
		assertEquals(8, calculator.evenCube(2));
	}
	
	@Test
	void testEvenCube_OddNumberShouldThrowException() {
		try {
			calculator.evenCube(1);
			calculator.evenCube(3);
		} catch (OddNumberException o) {
		}
		
	}
	
}
