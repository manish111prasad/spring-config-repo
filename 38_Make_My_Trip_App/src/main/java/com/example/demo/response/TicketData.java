package com.example.demo.response;

import lombok.Data;

@Data
public class TicketData {

	private Integer ticketNum;
	private String name;
	private Double cost;
	private String destination;
	private String source;
	private String doj;
	private String status;
	
}
