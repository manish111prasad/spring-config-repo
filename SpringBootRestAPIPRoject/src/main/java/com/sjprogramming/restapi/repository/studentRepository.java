package com.sjprogramming.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sjprogramming.restapi.entity.Student;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer>{
	
}
