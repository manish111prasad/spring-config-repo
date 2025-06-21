package com.example.demo.response;

import lombok.Data;

@Data
public class Ticket {

	private String name;
	private Integer age;
	private String source;
	private String destination;
	private Double cost;
	private Integer trainNo;
	private Integer ticketNumber;

}
