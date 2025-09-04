package com.example.demomini.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomini.model.Todo;
import com.example.demomini.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

	private final TodoService service;

	public TodoController(TodoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Todo> all() {
		return service.findAll();
	}

	@PostMapping
	public Todo create(@RequestBody Todo t) {
		return service.create(t);
	}

	@GetMapping("/{id}")
	public Todo one(@PathVariable Long id) {
		return service.get(id);
	}
}
