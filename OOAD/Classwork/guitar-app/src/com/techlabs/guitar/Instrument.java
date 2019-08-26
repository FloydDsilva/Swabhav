package com.techlabs.guitar;

public class Instrument {
	private final String serialNumber;
	private double price;
	private InstrumentSpec spec;
	
	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public InstrumentSpec getSpec() {
		return spec;
	}
}
