package com.example.demo.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Customers;

@Component
public class CustomerProcessor implements ItemProcessor<Customers, Customers> {

	@Override
	public Customers process(Customers item) throws Exception {
	
		
		//logic to process data --> For example. 👇👇👇
		/*
		 * if(item.getCountry().equals("India")) {
		 * return item;
		 * }
		 * else {
		 * return null; 
		 * }
		 */
		
		return null;
	}

}
