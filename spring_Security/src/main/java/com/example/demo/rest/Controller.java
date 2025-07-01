package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/contact")
	public String contact() {

		return "1234567890";
	}

	@GetMapping("/wish")
	public String wish() {

		return "Hello Guys";
	}

}
