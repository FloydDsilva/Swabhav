package com.techlabs.dogdoor;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("BarkRecognizer:Has heard a "+bark.getSound());
		List<Bark> allowedBarks =door.getAllowedBarks();
		for (Iterator iterator = allowedBarks.iterator(); iterator.hasNext();) {
			Bark allowedBark = (Bark) iterator.next();
			if(allowedBark.getSound().equals(bark.getSound())) {
				door.open();
				return;
			}
		}
		System.out.println("This dog is not allowed.");
	}
}
