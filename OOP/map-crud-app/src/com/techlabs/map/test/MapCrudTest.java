package com.techlabs.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.techlabs.map.MapCrud;

public class MapCrudTest {

	public static void main(String[] args) {
		MapCrud<String, String> hashMap=new MapCrud<String, String>(new HashMap<String, String>());
		MapCrud<String, String> linkedHashMap=new MapCrud<String, String>(new LinkedHashMap<String, String>());
		MapCrud<String, String> treeMap=new MapCrud<String, String>(new TreeMap<String, String>());
		
		
		hashMap.create("Sachin", "Tendulkar");linkedHashMap.create("Sachin", "Tendulkar");treeMap.create("Sachin", "Tendulkar");
		hashMap.create("Virat", "Kohli");linkedHashMap.create("Virat", "Kohli");treeMap.create("Virat", "Kohli");
		hashMap.create("Yuvraj", "Singh");linkedHashMap.create("Yuvraj", "Singh");treeMap.create("Yuvraj", "Singh");
		hashMap.create("null", "Dhoni");linkedHashMap.create("null", "Dhoni");treeMap.create("null", "Dhoni");
		hashMap.create("Amir", "Khan");linkedHashMap.create("Amir", "Khan");treeMap.create("Amir", "Khan");
		
		//hashMap.read("Sachin");
		System.out.println("HashMap");
		hashMap.read();
		System.out.println();
		System.out.println("LinkedHashMap");
		hashMap.read();
		System.out.println();
		System.out.println("TreeMap");
		hashMap.read();
		
		
		MapCrud<Integer, String> numbersHM=new MapCrud<Integer, String>(new HashMap<Integer, String>());
		MapCrud<Integer, String> numbersLHM=new MapCrud<Integer, String>(new LinkedHashMap<Integer, String>());
		MapCrud<Integer, String> numbersTM=new MapCrud<Integer, String>(new TreeMap<Integer, String>());
		
		
		numbersHM.create(1, "Tendulkar");numbersLHM.create(1, "Tendulkar");numbersTM.create(1, "Tendulkar");
		numbersHM.create(32, "Kohli");numbersLHM.create(32, "Kohli");numbersTM.create(32, "Kohli");
		numbersHM.create(2, "Singh");numbersLHM.create(2, "Singh");numbersTM.create(2, "Singh");
		numbersHM.create(555, "Dhoni");numbersLHM.create(555, "Dhoni");numbersTM.create(555, "Dhoni");
		numbersHM.create(4, "Khan");numbersLHM.create(4, "Khan");numbersTM.create(4, "Khan");
		numbersHM.create(775, "Dhoni");numbersLHM.create(775, "Dhoni");numbersTM.create(775, "Dhoni");
		numbersHM.create(634, "Khan");numbersLHM.create(634, "Khan");numbersTM.create(634, "Khan");
		//hashMap.read("Sachin");
		System.out.println("HashMap");
		numbersHM.read();
		System.out.println();
		System.out.println("LinkedHashMap");
		numbersLHM.read();
		System.out.println();
		System.out.println("TreeMap");
		numbersTM.read();
	}

	
	
	

}
