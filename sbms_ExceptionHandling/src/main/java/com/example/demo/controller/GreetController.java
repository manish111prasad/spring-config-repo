package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/greet")
public class GreetController {

	@GetMapping("/hello")
	public String greet(Model model) {
		
		String str = "This is greet message";
		model.addAttribute("msg",str);
		
		return "index";
	}
	
}
