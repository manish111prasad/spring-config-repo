package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	//Only accessed by admin
	@GetMapping(value = "/admin")
	public String admin() {
		return "<h3>Welcome Admin :)</h3>";
	}

	//Only accessed by User
	@GetMapping(value = "/user")
	public String user() {
		return "<h3>Hello User :)</h3>";
	}

	//Can be accessed by admin and user both
	@GetMapping(value = "/welcome")
	public String welcome() {
		return "<h3>Welcome :)</h3>";
	}

	
}
