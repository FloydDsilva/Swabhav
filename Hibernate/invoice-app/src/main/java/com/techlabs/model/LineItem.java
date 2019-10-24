package com.techlabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LineItem {
	@Id
	private int id;
	private String name;
	private int quantity;
	
	@ManyToOne
	@JoinColumn
	private Order odr;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Order getOdr() {
		return odr;
	}
	public void setOdr(Order odr) {
		this.odr = odr;
	}
	
}
