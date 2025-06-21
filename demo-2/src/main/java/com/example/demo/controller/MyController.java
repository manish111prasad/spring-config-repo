package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.MyNum;
import com.example.demo.services.interfaces.IMyService;

@RestController
@RequestMapping("/my-controller") 
public class MyController {
	
	private IMyService myService;
	private ApplicationContext applicationContext;
	
	@Autowired
	public MyController(IMyService myService, ApplicationContext applicationContext) {
		this.myService = myService; 
		this.applicationContext = applicationContext;
		System.out.println("MyController Constructor invoked | MyService: " + myService + " | appCxt: " + applicationContext);
	}

	@PostMapping("/process")
	public String process(@RequestBody MyNum myNum) {
		System.out.println("process() invoked | myNum: " + myNum);
		
		// Printing all bean names in the application context
		
		myService=applicationContext.getBean(IMyService.class);
		System.out.println(myService);
		// Corrected the logic to calculate sum
		int sum = myService.add(myNum.getNum1(), myNum.getNum2());
		System.out.println("sum: " + sum);
		
		return "Processing done! Sum: " + sum;
	}
}
