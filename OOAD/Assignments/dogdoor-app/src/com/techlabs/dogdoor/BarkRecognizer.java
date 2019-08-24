package com.techlabs.dogdoor;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(String bark) {
		System.out.println("BarkRecognizer:Has heard a "+bark);
		door.open();
	}
}
