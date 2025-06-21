package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	private Logger logger = LoggerFactory.getLogger(DemoController.class);

	@GetMapping("/")
	public String getMsg(Model model) {

		String str = "Good evening";

		int i = 10 / 0;

		model.addAttribute("msg", str);

		return "index";
	}

	@GetMapping("/hello")
	public String gethlo(Model model) {

		String str = "Null pointer aana chahiye";

		String i = null;

		i.length();
		model.addAttribute("msg", str);

		return "index";
	}

	/*
	 * @ExceptionHandler(value = ArithmeticException.class) public String
	 * ExceptionHandler(ArithmeticException ae) {
	 * 
	 * String exp = ae.getMessage();
	 * 
	 * logger.error(exp);
	 * 
	 * // String string = "Error orrured in the website, please try after sometime";
	 * 
	 * return "errorPage"; }
	 * 
	 * @ExceptionHandler(value = NullPointerException.class) public String
	 * NullException(NullPointerException npe) {
	 * 
	 * String msg = npe.getMessage();
	 * 
	 * logger.error(msg);
	 * 
	 * return "errorPage"; }
	 */

}
