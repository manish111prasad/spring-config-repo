package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.feign.GreetFeignClient;






@RestController
public class WelcomeRestController {

	@Autowired
	private GreetFeignClient greetClient;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		String greetResp = greetClient.invokeGreetApi();

		return greetResp + "Welcome to Ashok IT";
	}

}
