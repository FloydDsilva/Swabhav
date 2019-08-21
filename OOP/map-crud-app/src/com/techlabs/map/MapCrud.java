package com.techlabs.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapCrud <K,V>{
	Map<K, V> map;
	public MapCrud(Map<K, V> map) {
		this.map = map;
	}
	public void create(K key,V value) {
		map.put(key, value);
	}
	
	public void read() {
		for (Entry<K, V> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());		}
	}
	public void read(K key) {
		System.out.println(map.get(key));
	}
	public void update(K key,V value) {
		map.replace(key, value);
	}
	public void delete(K key) {
		map.remove(key);
	}
	
}
