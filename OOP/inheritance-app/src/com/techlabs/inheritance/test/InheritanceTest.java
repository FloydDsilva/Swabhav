package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.Infant;
import com.techlabs.inheritance.Kid;
import com.techlabs.inheritance.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		caseStudy1();
		caseStudy2();
		caseStudy3();
		caseStudy4();
		caseStudy5();
	}

	private static void caseStudy1() {
		Man x;			//x expects man object
		x=new Man();
		x.read();
		x.plays();
	}
	
	private static void caseStudy2() {
		Boy y; 			//y expects boy object
		y=new Boy();
		y.eat();
		y.plays();
		y.walk();
		y.read();
	}

	private static void caseStudy3() {
		Man x;			//x expects Man or subclasses of Man
		x=new Boy();
		x.read();
		x.plays();
	}
	
	private static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}

	private static void atThePark(Man man) {
		System.out.println("At the park");
		man.plays();
	}

	private static void caseStudy5() {
		Object x;
		x=10;
		System.out.println(x.getClass());
		x="Hello";
		System.out.println(x.getClass());
		x=new Man();
		System.out.println(x.getClass());
	}

}
