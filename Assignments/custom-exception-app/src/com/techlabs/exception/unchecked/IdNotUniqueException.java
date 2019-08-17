package com.techlabs.exception.unchecked;

public class IdNotUniqueException extends RuntimeException{
	public IdNotUniqueException(String message) {
		super(message);
	}
}
