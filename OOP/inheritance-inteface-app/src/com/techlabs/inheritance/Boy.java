package com.techlabs.inheritance;

public class Boy implements IManner, IEmotion {

	@Override
	public void cry() {
		System.out.println("Boy Cries");
	}

	@Override
	public void laugh() {
		System.out.println("Boy Laugh");
	}

	@Override
	public void wish() {
		System.out.println("Boy:Hi");
	}

	@Override
	public void depart() {
		System.out.println("Boy:Bye");
	}

}
