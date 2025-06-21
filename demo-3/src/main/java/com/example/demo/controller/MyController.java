package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/device")
public class MyController {
	
	@GetMapping("/laptop")
	public String laptop() {
		System.out.println("Inside laptop()| printing Laptop");
		return "returning Laptop";
	}
	@GetMapping("/mobile")
	public String mobile() {
		System.out.println("Inside mobile()| printing mobile");
		return "returning mobile";
	}
	
}
