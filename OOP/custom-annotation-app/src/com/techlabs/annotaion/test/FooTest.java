package com.techlabs.annotaion.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.annotaion.Foo;
import com.techlabs.annotaion.NeedToRefactor;

public class FooTest {

	public static void main(String[] args) {
		Class cls= Foo.class;
		Class annotation=NeedToRefactor.class;
		
		System.out.println("Count:"+getCountAnnotations(cls,annotation));
	}

	private static int getCountAnnotations(Class cls, Class annotation)  {
		int count=0;
		Object foo=null;
		try {
			foo=cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Method method : cls.getMethods()) {
			if(method.isAnnotationPresent(annotation)) {
				count+=1;
				System.out.println(method.getName());
				try {
					method.invoke(foo);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return count;
	}

}
