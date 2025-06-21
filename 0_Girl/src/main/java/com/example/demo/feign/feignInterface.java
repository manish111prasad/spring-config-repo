package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Pussy")
public interface feignInterface {

	@GetMapping("/pussy")
	String GirlFeignClient();
	
}
