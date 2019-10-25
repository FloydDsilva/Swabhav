package com.techlabs.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private String location;
	@OneToMany(mappedBy = "cust",cascade = CascadeType.ALL)
	private Set<Ordr> orders=new HashSet<Ordr>();
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Ordr> getOrders() {
		return orders;
	}
	public void setOrders(Set<Ordr> orders) {
		this.orders = orders;
	}
	
}
