package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(DataJpaApplication.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

		
		List<Book> book = repo.findBybookName("Spring");
		
		for(Book b:book) {
			System.out.println(b);
		}
		
		/*
		 * Book b = new Book(); b.setBookId(100); b.setBookName("Spring");
		 * b.setBookPrice(1000.00);
		 * 
		 * 
		 * b.setBookId(200); b.setBookName("LastBook"); b.setBookPrice(5000.00);
		 * 
		 * 
		 * repo.save(b);
		 */
		System.out.println("record Found...");

	}

}
