package com.example.demo.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER_INF0")
public class Customers {

	@Id
	@Column(name = "CUSTOMER_ID")
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String contactNum;
	private String country;
	

	
}
