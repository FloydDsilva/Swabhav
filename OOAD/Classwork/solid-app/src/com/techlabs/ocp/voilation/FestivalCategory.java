package com.techlabs.ocp.voilation;

public enum FestivalCategory {
	NEW_YEAR,HOLI,NORMAL;
	
	@Override
	public String toString() {
		switch (this) {
		case NEW_YEAR:
			return "New Year";
		case HOLI:
			return "Holi";
		case NORMAL:
			return "Normal";
		default:
			return null;
		}
	}
}
