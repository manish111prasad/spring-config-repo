package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Passenger;
import com.example.demo.response.Ticket;
import com.example.demo.service.BookingService;

@RestController
public class Controller {

	@Autowired
	private BookingService service;
	
	@PostMapping(value = "/ticket", consumes = {"application/json"}, produces = {"appliation/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		
		Ticket ticket = service.ticketBooking(passenger);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
		
		
	}
	
	@GetMapping(value = "/ticket/{ticketNumber}", produces = {"application/json"})
	public Ticket getTicket( @PathVariable("ticketNumber") Ticket ticketNumber) {
		
		return service.getTicket(ticketNumber);
		
	}
	
}
