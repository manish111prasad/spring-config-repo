package com.example.demo;

import java.awt.print.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebMvcApp1Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctxt = SpringApplication.run(WebMvcApp1Application.class, args);
		
		/*
		 * Book repo=ctxt.getBean(Book.class);
		 * 
		 * if(repo.existsById(100)) repo.deleteById(100); else {
		 * System.out.println("Id not available"); }
		 */
	}

}
