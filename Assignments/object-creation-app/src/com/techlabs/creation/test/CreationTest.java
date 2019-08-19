package com.techlabs.creation.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.techlabs.creation.Foo;

public class CreationTest {
	public static void main(String[] args) {
		method1();	//Using new
		method2();	//Using reflection
		method3();	//Using Clonable (shallow copying)
		method4();	//Using ClassLoader
		method5();	//Using Deserialization
		method6();	//Using reflection(newInstance) by using constructors
	}

	private static void method1() {
		Foo foo=new Foo();
		System.out.println("Method1 "+foo.getBar());	
	}
	
	private static void method2() {
		Class cls=Foo.class;
		Object fooObj = null;
		try {
			fooObj = cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method2 "+((Foo) fooObj).getBar());	
	}
	
	private static void method3() {
		Foo foo=new Foo();
		Foo fooClone=null;
		try {
			fooClone=(Foo) foo.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method3 "+fooClone.getBar());	
	}
	
	private static void method4() {
		Foo foo=new Foo();
		Foo fooCopy = null;
		try {
			fooCopy = (Foo) foo.getClass().getClassLoader().loadClass("com.techlabs.creation.Foo").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method4 "+fooCopy.getBar());	
	}
	
	private static void method6() {
		try {
			Constructor<Foo> constructor=Foo.class.getConstructor();
			Foo foo = constructor.newInstance();
			System.out.println("Method6 "+foo.getBar());
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method5() {
		Foo foo=new Foo();
		serializeObject(foo, "resources\\foo.ser");
		Foo fooNew=deserializeObject("resources\\foo.ser");
		System.out.println("Method5 "+fooNew.getBar());	
	}
	
	private static void serializeObject(Foo foo,String path) {
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path))){
			out.writeObject(foo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("rawtypes")
	private static Foo deserializeObject(String path) {
		Foo fooNew=null;
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(path))){
			fooNew=(Foo) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return fooNew;
	}
}
