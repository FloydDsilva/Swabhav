package com.techlabs.guitar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars=new ArrayList<Guitar>();
	public void addGuitar(String serialNumber, double price, Builder builder,String model,Type type,int numStrings, Wood backWood,Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, new GuitarSpec(builder, model, type, numStrings, backWood, topWood)));
	}
	public Guitar getGuitar(String serialNumber) {
		for(Iterator<Guitar> i=guitars.iterator();i.hasNext();) {
			Guitar guitar=i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars=new LinkedList<Guitar>();
		for(Iterator<Guitar> i=guitars.iterator();i.hasNext();) {
			Guitar guitar=i.next();
			GuitarSpec guitarSpec=guitar.getSpec();
			if(guitarSpec.matches(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
	
}
