package com.sjprogramming.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sjprogramming.restapi.entity.Student;
import com.sjprogramming.restapi.repository.studentRepository;

@RestController
public class studentController {
	
	@Autowired
	studentRepository repo;

	//get Data from the database and display it to the client
	@GetMapping("/students")
	public List<Student> getAllStudents(){
	List<Student> students = repo.findAll();
		return students;
	}
	
	//localhost:8080//students/1
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		
	Student student	= repo.findById(id).get();
		
		return student;
		
	}
	
	@PostMapping("student/add")
	public void createStudent(@RequestBody Student student){
		
		repo.save(student);
		
	}
	
}
