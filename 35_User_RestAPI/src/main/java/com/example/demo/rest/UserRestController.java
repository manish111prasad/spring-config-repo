package com.example.demo.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.User;

@RestController
public class UserRestController {

	private Map<Integer, User> dataMap = new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {

		System.out.println(user);
		dataMap.put(user.getId(), user);

		return new ResponseEntity<String>("User Saved", HttpStatus.CREATED);

	}

	@GetMapping("/user")
	public User getUserId(@RequestParam("userid") User user) {
		User user1=dataMap.get(user);
		return user1;
	}
	
	@GetMapping("/users/{id}/data")
	public User getCustomUserId(@RequestParam("userid") User user, @RequestParam("username") String name) {
		User user2=dataMap.get(user);
		return user2;
	

}
}
