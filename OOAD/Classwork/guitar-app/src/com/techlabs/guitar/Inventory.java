package com.techlabs.guitar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars=new ArrayList<Guitar>();
	public void addGuitar(String serialNumber, double price, Builder builder,String model,Type type,Wood backWood,Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood))
	}
	public Guitar getGuitar(String guitar) {
		return 
	}
	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchiGuitars=new LinkedList<Guitar>();
		for(Iterator<Guitar> i=guitars.iterator();i.hasNext();) {
			Guitar guitar=i.next();
			GuitarSpec guitarSpec=guitar.getSpec();
			if(searchSpec.getBuilder()!=guitarSpec.getBuilder()) {
				continue;
			}
			String model= searchSpec.getModel().toLowerCase();
			if((model!=null)&&(!model.equals(""))&&(!model.equals(guitarSpec.getModel().toString()))) {
				continue;
			}
			if(searchSpec.getType()!=guitarSpec.getType()) {
				continue;
			}
			if(searchSpec.getBackWood()!=guitarSpec.getBackWood()) {
				continue;
			}
			if(searchSpec.getTopWood()!=guitarSpec.getTopWood()) {
				continue;
			}
			matchiGuitars.add(guitar);
		}
		return matchiGuitars;
	}
}
