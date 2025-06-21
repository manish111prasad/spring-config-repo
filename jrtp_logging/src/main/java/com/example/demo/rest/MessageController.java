package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	private Logger logger = LoggerFactory.getLogger(MessageController.class);

	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.info("welcomeMsg() Execution started.....");
		String str = "Welcome to Ashok IT";
		logger.info("WelcomeMsg() execution ended");
		return str;
	}

	@GetMapping("/greet")
	public String greet() {
		logger.info("greetMsg() Execution started.....");
		String str = "Good Morinng";
		logger.info("greetMsg() execution ended");
		return str;
	}

}
