package com.example.demo.exception;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppApplicationHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e) {

		String expMsg = e.getMessage();

		ErrorInfo info = new ErrorInfo();

		info.setCode("SBIEX003");
		info.setMsg(expMsg);
		info.setWhen(LocalDateTime.now());

		return new ResponseEntity<ErrorInfo>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<String> UNF_Method(UserNotFoundException unfe) {
		
		String customEx = unfe.getMessage();
		
		return new ResponseEntity<String>(customEx, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	
	
	
	

}
