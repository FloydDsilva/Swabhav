package com.techlabs.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.guitar.Inventory;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory =new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatErinLikes=new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER);
		List<Guitar> matchingGuitars=inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for(Iterator<Guitar> i=matchingGuitars.iterator();i.hasNext();) {
				Guitar guitar=i.next();
				System.out.println(" We have a "+guitar.getSpec().getBuilder()+" "+guitar.getSpec().getModel()+" "+guitar.getSpec().getNumStrings()+" Strings,\n"+guitar.getSpec().getType()+" guitar:\n"+guitar.getSpec().getBackWood()+" back and sides,\n "+guitar.getSpec().getTopWood()+" top.\n You can have it for only $"+guitar.getPrice()+"!\n ----");
			}
		}
		else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V95653", 1400.99, Builder.GIBSON, "Stratocastor", Type.ELECTRIC, 5,Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V9533", 1679.95, Builder.FENDER, "Stratocastor", Type.ACOUSTIC, 5,Wood.ALDER, Wood.ALDER);
	}

}
