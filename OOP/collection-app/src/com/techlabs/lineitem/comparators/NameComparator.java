package com.techlabs.lineitem.comparators;

import java.util.Comparator;

import com.techlabs.lineitem.LineItem;

public class NameComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem item1, LineItem item2) {
		return item1.getProductName().compareTo(item2.getProductName());
	}

}
