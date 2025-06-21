package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller
public class Welcome {
	
	public String wlcmController(Model model) {
		
		String string = "This is welcome controller";
		model.addAttribute("welcome", string);
		
		return "index";
	}
	
}
