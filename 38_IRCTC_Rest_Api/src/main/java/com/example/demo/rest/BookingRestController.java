package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.PassengerData;
import com.example.demo.response.TicketData;
import com.example.demo.service.BookingService;

@RestController
public class BookingRestController {

	@Autowired
	private BookingService service;

	@PostMapping(value = "/ticket", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<TicketData> getDetails(@RequestBody PassengerData passengerData) {

		System.out.println(passengerData);
		TicketData ticketData = service.bookTicket(passengerData);

		return new ResponseEntity<TicketData>(ticketData, HttpStatus.CREATED);

	}

	@GetMapping(value = "/ticket/{ticketNum}", produces = {"application/json"})
	public TicketData getTicketDetails(@PathVariable("ticketNum") Integer ticketNum) {

		return service.getTicket(ticketNum);

	}

}
