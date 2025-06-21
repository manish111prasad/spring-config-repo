package com.example.demo.service;

import com.example.demo.binding.Passenger;
import com.example.demo.response.Ticket;

public interface BookingService {

	public Ticket ticketBooking(Passenger passenger);
	
	public Ticket getTicket(Ticket ticketNumber);
	
}
