package com.example.demo.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.demo.binding.PassengerData;
import com.example.demo.response.TicketData;
import com.example.demo.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer, TicketData> ticketsMap = new HashMap<>();
	private Integer ticketNum =1;
	@Override
	public TicketData bookTicket(PassengerData passenger) {
		
		TicketData ticketData = new TicketData();
		BeanUtils.copyProperties(passenger, ticketData);
		ticketData.setName("manish");
		ticketData.setCost(2000.00);
		ticketData.setSource("Pune");
		ticketData.setDestination("Bhopal");
		ticketData.setDoj("4/5/2025");
		ticketData.setTicketNum(ticketNum);
		ticketData.setStatus("Conformed");
		ticketNum++;
		
		ticketsMap.put(ticketNum, ticketData);
		
		return ticketData;
	}

	@Override
	public TicketData getTicket(Integer ticketNumber) {
		
		if(ticketsMap.containsKey(ticketNumber)) { 
			return ticketsMap.get(ticketNumber);
		}
		
		
		return null;
	}

}
