package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@GetMapping("/")
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setId(1);
		c.setName("manish");
		c.setEmail("hello@gmail.com");
		c.setPhno(123456789);

		return c;

	}
}
