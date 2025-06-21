package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to Zolo");
		mav.setViewName("message");
		
		return mav;
		
	}
	
}
