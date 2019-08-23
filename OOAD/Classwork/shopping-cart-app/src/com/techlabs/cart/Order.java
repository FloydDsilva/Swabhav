package com.techlabs.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private final String id;
	private List<LineItem> items = new ArrayList<LineItem>();
	private final Date date;

	public Order(String id, Date date) {
		this.id = id;
		this.date = date;
	}

	public void addLineItem(LineItem lineItem) {
		if (items.size() == 0) {
			items.add(lineItem);
		} else {
			if (contains(lineItem)) {
				for (LineItem item : items) {
					if (item.getProduct().getId().equals(lineItem.getProduct().getId())) {
						item.setQuantity(item.getQauntity() + lineItem.getQauntity());
					}
				}

				

			}
			else {
				items.add(lineItem);
			}

		}

	}

	public boolean contains(LineItem searchItem) {
		for (LineItem item : items) {
			if (item.getProduct().getId().equals(searchItem.getProduct().getId())) {
				return true;
			}
		}
		return false;
	}

	public void removeLineItem(String id) {
		for (LineItem item : items) {
			if (item.getId().equalsIgnoreCase(id)) {
				items.remove(item);
				break;
			}
		}
	}

	public int count() {
		return items.size();
	}

	public double checkOutPrice() {
		double price = 0;
		for (LineItem item : items) {
			price += item.itemCost();
		}
		return price;
	}

	public String getId() {
		return id;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public Date getDate() {
		return date;
	}

}
