package com.example.demo.service;

import com.example.demo.binding.Passenger;
import com.example.demo.response.Ticket;

public interface MakeMyTripService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket geTicket (Ticket ticketNum);
	
}
