package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class MyController {

	@GetMapping("/bmw")
	public String bmw() {
		System.out.println("Inside bmw() | BMW");
		return "bmw cars";
	}
	@GetMapping("/audi")
	public String audi() {
		System.out.println("Inside audi() | Audi");
		return "audi cars";
	}
	@GetMapping("/mercedes")
	public String mercedes() {
		System.out.println("Inside mercedes() | Mercedes");
		return "mercedes cars";
	}
	
}
