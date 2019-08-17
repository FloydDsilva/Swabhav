package com.techlabs.inheritance;

public class Man implements IManner {

	@Override
	public void wish() {
		System.out.println("Man:Hello");
	}

	@Override
	public void depart() {
		System.out.println("Man:Good Bye!");
	}

}
