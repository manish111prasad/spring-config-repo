package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripe")
public class StripeWebHookController {
	
	@RequestMapping("/webhook")
	public int addPost(@RequestBody String eventBody) {
		
		System.out.println("Received Event");
		return 1;
		
	}
	
}
