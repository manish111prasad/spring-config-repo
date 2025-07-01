package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.models.Users;

@Service
public class UserService {

	private List<Users> store = new ArrayList();

	public UserService() {

		store.add(new Users(UUID.randomUUID().toString(), "Durgesh Tiwari", "durgesh@dev.in"));
		store.add(new Users(UUID.randomUUID().toString(), "Harsh Tiwari", "harsh@dev.in"));
		store.add(new Users(UUID.randomUUID().toString(), "Ankit Tiwari", "ankit@dev.in"));
		store.add(new Users(UUID.randomUUID().toString(), "Gautam Shukla", "gautam@dev.in"));

	}

	public List<Users> getUsers() {
		return this.store;
	}

}
