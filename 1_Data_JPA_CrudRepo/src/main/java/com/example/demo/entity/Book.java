package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "book")
public class Book {

	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
}
