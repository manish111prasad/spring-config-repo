package com.example.demo.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Passenger;
import com.example.demo.response.Ticket;
import com.example.demo.service.BookingService;

@Service
public class bookingServiceImpl implements BookingService {

	private Map<Integer, Ticket> hashmap = new HashMap();
	Integer ticketNumber = 1;

	@Override
	public Ticket ticketBooking(Passenger passenger) {

		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setName("manish");
		ticket.setAge(26);
		ticket.setSource("Pune");
		ticket.setDestination("Bhopal");
		ticket.setTrainNo(22222);
		ticket.setTicketNumber(ticketNumber);
		ticketNumber++;

		hashmap.put(ticketNumber, ticket);

		return ticket;
	}

	@Override
	public Ticket getTicket(Ticket ticketNumber) {

		if (hashmap.containsKey(ticketNumber)) {
			return hashmap.get(ticketNumber);
		}

		return null;
	}

}
