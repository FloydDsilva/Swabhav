package com.techlabs.unittest.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.unittest.Foo;
import com.techlabs.unittest.TestCase;

public class FooUnitTest {

	public static void main(String[] args) {
		Class cls=Foo.class;
		Class annotation=TestCase.class;
		System.out.println("Test Cases passed:"+getCountPassedTestCases(cls,annotation));
		
	}

	public static int getCountPassedTestCases(Class cls, Class annotation) {
		int count=0;
		Object foo=null;
		try {
			foo=cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Method method:cls.getDeclaredMethods()) {
			try {
				if(method.isAnnotationPresent(annotation) && (boolean) method.invoke(foo)) {
					count+=1;
				}
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}

}
