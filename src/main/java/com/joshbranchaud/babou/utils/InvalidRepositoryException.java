package com.joshbranchaud.babou.utils;

public class InvalidRepositoryException extends RuntimeException {

	public InvalidRepositoryException() {
		super();
	}
	
	public InvalidRepositoryException(String s) {
		super(s);
	}
	
	public InvalidRepositoryException(String s, Throwable throwable) {
		super(s, throwable);
	}
	
	public InvalidRepositoryException(Throwable throwable) {
		super(throwable);
	}
}
