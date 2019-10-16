package com.techlabs.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoggingInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("Logging Interceptor Initialized");
	}

	@Override
	public void init() {
		System.out.println("Logging Interceptor Destroyed");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String className = invocation.getAction().getClass().getName();
		long startTime = System.currentTimeMillis();
		System.out.println("Before calling action: " + className);
		String result = invocation.invoke();
		long endTime = System.currentTimeMillis();
		System.out.println("After calling action: " + className+ " Time taken: " + (endTime - startTime) + " ms");
		return result;
	}

}
