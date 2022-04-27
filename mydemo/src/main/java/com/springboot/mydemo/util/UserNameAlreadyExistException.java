package com.springboot.mydemo.util;

public class UserNameAlreadyExistException extends Exception{
	public UserNameAlreadyExistException() {
		super();
	}
	
	public UserNameAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}
	
	public UserNameAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	public UserNameAlreadyExistException(String message) {
		super(message);
		
	}
	
	public UserNameAlreadyExistException(Throwable cause) {
		super(cause);
		
	}
}
