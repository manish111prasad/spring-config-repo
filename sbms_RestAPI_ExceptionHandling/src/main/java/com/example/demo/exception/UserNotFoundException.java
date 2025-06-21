package com.example.demo.exception;


public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException() {		//Constructor
			
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}
	
}
