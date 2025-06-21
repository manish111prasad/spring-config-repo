package com.example.demo.service;

import com.example.demo.binding.PassengerData;
import com.example.demo.response.TicketData;

public interface BookingService {

	public TicketData bookTicket(PassengerData passenger);
	
	public TicketData getTicket (Integer ticketNumber);
	
}
