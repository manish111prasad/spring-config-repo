package com.example.demomini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demomini.model.Todo;
import com.example.demomini.repo.TodoRepository;

@Service
public class TodoService {

	private final TodoRepository repo;

	public TodoService(TodoRepository repo) {
		this.repo = repo;
	}

	public List<Todo> findAll() {
		return repo.findAll();
	}

	public Todo create(Todo t) {
		return repo.save(t);
	}

	public Todo get(Long id) {
		return repo.findById(id).orElse(null);
	}
}
