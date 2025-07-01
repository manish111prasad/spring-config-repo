package com.example.demo.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;

@Component
public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		
	//process Logic	
		System.out.println("Processing customer: " + item);
		return item;
	}
		
}
