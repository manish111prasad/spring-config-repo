package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	private Logger logger = LoggerFactory.getLogger(MsgRestController.class);
	
	@GetMapping("/")
	public String getWelcomeMsg() {
		
		logger.debug("this is debug message");
		logger.info("WelcomeMsg() started");
		logger.warn("this is warning msg");
		
		try {
			int i = 10/0;
		}catch (Exception e) {
			logger.error("Exception occured ::"+ e.getMessage());
		}
		
		String str = "Hello buddy";
		logger.info("WelcomeMsg() ended");		
		return str;
	}
	
}
