package com.example.demo.services.impl;

import org.springframework.stereotype.Service;

import com.example.demo.services.interfaces.IMyService;

@Service
public class MyServiceImpl implements IMyService{
	
	public MyServiceImpl() {
		System.out.println("MyServiceImpl || Constructor invoked");
	}

	public int add(int num1, int num2) {
		System.out.println("MyServiceImpl:: add() invoked | num1:"+num1+"|num2"+num2);
		int sum=num1+num2;
		System.out.println("MyServiceImpl || sum:"+sum);
		return sum;
	}
	
}
