package com.techlabs.sets;

import java.util.HashSet;
import java.util.Set;

public class CommonSetClass {
	private Set<String> set;
	
	public CommonSetClass(Set<String> set) {
		super();
		this.set = set;
	}

	
	public Set<String> getSet() {
		return set;
	}


	public void create(String value) {
		set.add(value);
	}
	public void read() {
		System.out.println(set);
	}
	public void update(String oldValue,String newValue) {
		set.remove(oldValue);
		set.add(newValue);
	}
	public void delete(String value) {
		set.remove(value);
	}
}
