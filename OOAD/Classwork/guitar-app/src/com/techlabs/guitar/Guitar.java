package com.techlabs.guitar;

public class Guitar {
	private final String serialNumber;
	private double price;
	private final GuitarSpec spec;
	public Guitar(String serialNumber, double price, Builder builder,String model,Type type,Wood backWood,Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
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
	public GuitarSpec getSpec() {
		return spec;
	}
	
}
