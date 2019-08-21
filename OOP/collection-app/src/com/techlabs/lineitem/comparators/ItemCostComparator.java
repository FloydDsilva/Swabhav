package com.techlabs.lineitem.comparators;

import java.util.Comparator;

import com.techlabs.lineitem.LineItem;

public class ItemCostComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {
		return (int) (item1.getCost()-item2.getCost());
	}

}
