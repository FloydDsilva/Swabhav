package com.techlabs.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.techlabs.sets.CommonSetClass;

public class SetClassTest {

	public static void main(String[] args) {
		CommonSetClass hashSet=new CommonSetClass(new HashSet<String>());
		CommonSetClass linkedHashSet=new CommonSetClass(new LinkedHashSet<String>());
		CommonSetClass treeSet=new CommonSetClass(new TreeSet<String>());
		hashSet.create("Sachin");linkedHashSet.create("Sachin");treeSet.create("Sachin");
		hashSet.create("Virat");linkedHashSet.create("Virat");treeSet.create("Virat");
		hashSet.create("Yuvraj");linkedHashSet.create("Yuvraj");treeSet.create("Yuvraj");
		hashSet.create("Bhim");linkedHashSet.create("Bhim");treeSet.create("Bhim");
		hashSet.create("Amir");linkedHashSet.create("Amir");treeSet.create("Amir");
		
		hashSet.read();linkedHashSet.read();treeSet.read();
		System.out.println();
		hashSet.create("Raghav");linkedHashSet.create("Raghav");treeSet.create("Raghav");
		hashSet.create("Pritam");linkedHashSet.create("Pritam");treeSet.create("Pritam");
		hashSet.create("Rahul");linkedHashSet.create("Rahul");treeSet.create("Rahul");
		hashSet.create("Azaad");linkedHashSet.create("Azaad");treeSet.create("Azaad");
		hashSet.create("Sam");linkedHashSet.create("Sam");treeSet.create("Sam");
		hashSet.read();linkedHashSet.read();treeSet.read();
		
		System.out.println();
		hashSet.update("Bhim", "Bheem");linkedHashSet.update("Bhim", "Bheem");treeSet.update("Bhim", "Bheem");
		
		hashSet.read();linkedHashSet.read();treeSet.read();
		
		System.out.println();
		
		hashSet.delete("Sachin");linkedHashSet.delete("Sachin");treeSet.delete("Sachin");
		hashSet.read();linkedHashSet.read();treeSet.read();
	}

}
