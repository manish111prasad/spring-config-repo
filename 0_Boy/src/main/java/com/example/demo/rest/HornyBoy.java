package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feign.feignInterface;

@RestController
public class HornyBoy {

	@Autowired
	private feignInterface feign;
	
	@GetMapping("/dick")
	public String boy(){
		
		String fucked = feign.GirlFeignClient();
		
		return "Dick " +fucked;
	}
	
}
