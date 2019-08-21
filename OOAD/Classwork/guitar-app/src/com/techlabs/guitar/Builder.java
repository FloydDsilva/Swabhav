package com.techlabs.guitar;

public enum Builder {
	FENDER,MARTIN,GIBSON,COLLINGS,OLSON,RYAN,ANY,PRS;
	@Override
	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		case COLLINGS:
			return "Colings";
		case OLSON:
			return "Olson";
		case RYAN:
			return "Ryan";
		case ANY:
			return "Any";
		case PRS:
			return "PRS";
		}
		return null;
	}
}
