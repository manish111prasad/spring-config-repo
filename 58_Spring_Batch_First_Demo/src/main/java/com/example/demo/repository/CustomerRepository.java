package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

	
	
}
