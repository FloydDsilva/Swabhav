package com.techlabs.guitar.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.guitar.Instrument;
import com.techlabs.guitar.InstrumentSpec;
import com.techlabs.guitar.InstrumentType;
import com.techlabs.guitar.Inventory;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory =new Inventory();
		initializeInventory(inventory);
		
		Map<String, Object> properties = new HashMap<String, Object>();
	    properties.put("builder", Builder.GIBSON);
	    properties.put("backWood", Wood.MAPLE);
		InstrumentSpec whatErinLikes = new InstrumentSpec(properties);

		List<Instrument> matchinginInstruments=inventory.search(whatErinLikes);
		if(!matchinginInstruments.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for(Iterator<Instrument> i=matchinginInstruments.iterator();i.hasNext();) {
				Instrument instrument=i.next();
				InstrumentSpec spec=instrument.getSpec();
				System.out.println("We have a "+spec.getProperty("instrumentType")+" with following properties");
				displayInstrumentProperties(spec.getProperties());
				System.out.println(" You can have this "+spec.getProperty("instrumentType")+" for $"+instrument.getPrice()+"\n-----");
			}
		}
		else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void displayInstrumentProperties(Map<String, Object> properties) {
		for (Iterator<String> i = properties.keySet().iterator(); i.hasNext();) {
			String propertyName = i.next();
			if(propertyName.equalsIgnoreCase("InstrumentType")) {
				continue;
			}
			System.out.println("\t "+propertyName+" : "+properties.get(propertyName));
		}
	}

	private static void initializeInventory(Inventory inventory) {
		Map<String,Object> properties = new HashMap<String, Object>();
	    properties.put("instrumentType", InstrumentType.GUITAR);
	    properties.put("builder", Builder.COLLINGS);
	    properties.put("model", "CJ");
	    properties.put("type", Type.ACOUSTIC);
	    properties.put("numStrings", 6);
	    properties.put("topWood", Wood.INDIAN_ROSEWOOD);
	    properties.put("backWood", Wood.SITKA);
	    inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.MARTIN);
	    properties.put("model", "D-18");
	    properties.put("topWood", Wood.MAHOGANY);
	    properties.put("backWood", Wood.ADIRONDACK);
	    inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.FENDER);
	    properties.put("model", "Stratocastor");
	    properties.put("type", Type.ELECTRIC);
	    properties.put("topWood", Wood.ALDER);
	    properties.put("backWood", Wood.ALDER);
	    inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
	    inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
	 
	    properties.put("builder", Builder.GIBSON);
	    properties.put("model", "Les Paul");
	    properties.put("topWood", Wood.MAPLE);
	    properties.put("backWood", Wood.MAPLE);
	    inventory.addInstrument("70108276", 2295.95, 
	      new InstrumentSpec(properties));

	    properties.put("model", "SG '61 Reissue");
	    properties.put("topWood", Wood.MAHOGANY);
	    properties.put("backWood", Wood.MAHOGANY);
	    inventory.addInstrument("82765501", 1890.95, 
	      new InstrumentSpec(properties));

	    properties.put("instrumentType", InstrumentType.MANDOLIN);
	    properties.put("type", Type.ACOUSTIC);
	    properties.put("model", "F-5G");
	    properties.put("backWood", Wood.MAPLE);
	    properties.put("topWood", Wood.MAPLE);
	    properties.remove("numStrings");
	    inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

	    properties.put("instrumentType", InstrumentType.BANJO);
	    properties.put("model", "RB-3 Wreath");
	    properties.remove("topWood");
	    properties.put("numStrings", 5);
	    inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));

	}

}
