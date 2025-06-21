package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {

		String str = "Message saved successfully";

		return new ResponseEntity<String>(str, HttpStatus.CREATED);
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		String str = "this is Manish";

		return str;

	}

	@GetMapping("/greet")
	public String getGreetMsg() {

		String str = "ye greet msg hai";

		return str;
	}

}
