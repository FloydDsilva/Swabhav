package com.techlabs.guitar;

public class GuitarSpec {
	private final Builder builder;
	private final String model;
	private final Type type;
	private final int numStrings;
	private final Wood backWood; 
	private final Wood topWood;
	
	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings=numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public boolean matches(GuitarSpec otherSpec) {
		if(getBuilder()!=otherSpec.builder) {
			return false;
		}
		if((model!=null)&&(!model.equals(""))&&(!model.equalsIgnoreCase(otherSpec.getModel()))) {
			return false;
		}
		if(getType()!=otherSpec.getType()) {
			return false;
		}
		if(getNumStrings()!=otherSpec.numStrings) {
			return false;
		}
		if(getBackWood()!=otherSpec.getBackWood()) {
			return false;
		}
		if(getTopWood()!=otherSpec.getTopWood()) {
			return false;
		}
		return true;
	}
	
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	
}
