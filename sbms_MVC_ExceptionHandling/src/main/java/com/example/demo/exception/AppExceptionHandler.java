package com.example.demo.exception;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);
	
	@ExceptionHandler
	public String handleAE(Exception e) {
		
		String string = e.getMessage();
		
		logger.error(string);
		
		return "errorPage";
	}
	
}
