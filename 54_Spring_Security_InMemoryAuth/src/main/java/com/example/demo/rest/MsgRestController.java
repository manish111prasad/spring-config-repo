package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/contact")
	public String contact() {
		
		return "1234567890";
	}

	@GetMapping("/greet")
	public String greetMsg() {
		
		return "Good evening";
	}
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		return "Welcome to our Application";
	}
	
}
