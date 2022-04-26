
package com.springboot.mydemo.util;

public class UserEmailAlreadyExistException extends Exception{
	
		/**
		 * Instantiates a new user email already exist exception.
		 */
		public UserEmailAlreadyExistException() {
			super();
		}
		
		public UserEmailAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
			
		}
		
		public UserEmailAlreadyExistException(String message, Throwable cause) {
			super(message, cause);
			
		}
		
		public UserEmailAlreadyExistException(String message) {
			super(message);
			
		}
		
		public UserEmailAlreadyExistException(Throwable cause) {
			super(cause);
			
		}
}
