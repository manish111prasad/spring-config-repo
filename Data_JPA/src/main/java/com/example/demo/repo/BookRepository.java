package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	public List<Book> findBybookName(String bookName);
	
}
