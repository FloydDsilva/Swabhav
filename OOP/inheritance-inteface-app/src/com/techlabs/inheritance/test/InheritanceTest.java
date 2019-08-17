package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.IEmotion;
import com.techlabs.inheritance.IManner;
import com.techlabs.inheritance.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		atTheParty(new Man());
		atTheParty(new Boy());
		atTheMovies(new Boy());
		
		atTheMovies((IEmotion) new Man());
	}

	private static void atTheMovies(IEmotion obj) {
		System.out.println("At Movies");
		obj.cry();
		obj.laugh();
	}

	private static void atTheParty(IManner obj) {
		System.out.println("At the party");
		obj.wish();
		obj.depart();
	}

}
