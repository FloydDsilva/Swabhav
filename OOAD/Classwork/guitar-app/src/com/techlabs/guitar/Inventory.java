package com.techlabs.guitar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Instrument> instruments=new ArrayList<Instrument>();
	
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		instruments.add(new Instrument(serialNumber, price, spec));
	}
	
	public Instrument get(String serialNumber) {
		for(Iterator<Instrument> i=instruments.iterator();i.hasNext();) {
			Instrument instrument=i.next();
			if(instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}
	
	public List<Instrument> search(InstrumentSpec searchSpec) {
		List<Instrument> matchingInstruments=new LinkedList<Instrument>();
		for(Iterator<Instrument> i=instruments.iterator();i.hasNext();) {
			Instrument instrument=i.next();
			InstrumentSpec instrumentSpec=instrument.getSpec();
			if(instrumentSpec.matches(searchSpec)) {
				matchingInstruments.add(instrument);
			}
		}
		return matchingInstruments;
	}
	
}
