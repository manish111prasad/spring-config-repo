package com.example.demo.rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Country;

@RestController
public class CountryRestController {

	HashOperations<String, Integer, Country> opsForHash = null;
	
	public CountryRestController(RedisTemplate<String, Country> rt) {		//Default Constructor
		
		this.opsForHash = rt.opsForHash();
		
	}
	
	@PostMapping("/country")
	public String addCountry(@RequestBody Country country) {
		
		opsForHash.put("COUNTRIES", country.getSno(), country);
		
		return "Country Added";
	}
	
	@GetMapping("/countries")
	public Collection<Country> getCountries() {
	
		Map<Integer , Country> entries = opsForHash.entries("COUNTRIES");
		Collection<Country> values = entries.values();
		return values;
		
	}
	
}
