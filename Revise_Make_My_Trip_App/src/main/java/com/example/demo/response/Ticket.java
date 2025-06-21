package com.example.demo.response;

import lombok.Data;

@Data
public class Ticket {

	private String name;
	private String source;
	private String destination;
	private Integer trainNum;
	private Double cost;
	private Integer ticketNum;
	
}
