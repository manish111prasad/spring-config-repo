package com.example.demo.service;

import com.example.demo.request.PassengerData;
import com.example.demo.response.TicketData;

public interface MakeMyTripService {

	public TicketData bookTicket(PassengerData passengerData);
	
	public TicketData getTicket(TicketData ticketData);
	
}
