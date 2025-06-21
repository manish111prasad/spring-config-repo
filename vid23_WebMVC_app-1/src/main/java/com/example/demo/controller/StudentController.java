package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.binding.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model) {

		// Student sobj = new Student();

		List<String> courses = service.getCourses();

		// sobj.setName("Manish");

		model.addAttribute("autocourse", courses);
		
		model.addAttribute("prefTimings", service.getTimings());

		return "index";
	}

	@PostMapping("/save")
	public String saveStudent(Student s, Model model) {

		System.out.println(s);
		
		List<String> courses = service.getCourses();

		// sobj.setName("Manish");

		model.addAttribute("autocourse", courses);
		
		model.addAttribute("prefTimings", service.getTimings());

		return "index";
	}

}
