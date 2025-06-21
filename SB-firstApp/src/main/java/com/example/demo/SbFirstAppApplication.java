package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SbFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbFirstAppApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "You are welcomed";
	}
	
}
