package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.request.PassengerData;

import ch.qos.logback.core.model.Model;

@Controller
public class MakeMyTripController {

	@GetMapping("/")
	public String loadForm(Model model) {

		model.addAttribute("passengerData", new PassengerData());

		return "index";
	}

}
