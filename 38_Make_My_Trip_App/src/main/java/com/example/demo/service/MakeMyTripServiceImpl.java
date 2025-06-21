package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.request.PassengerData;
import com.example.demo.response.TicketData;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	private String BOOK_TICKET_URL="http://13.232.253.164:8080/ticket";
	
	private String GET_TICKET_URL="http://13.232.253.164:8080/ticket/{ticketNum}";
	
	public TicketData bookTicket(PassengerData passengerData) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<TicketData> responseEntity = rt.postForEntity(BOOK_TICKET_URL, passengerData, TicketData.class);
		TicketData ticketData = responseEntity.getBody();
		
		return ticketData;
	}

	
	public TicketData getTicket(TicketData ticketNumber) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<TicketData> responseEntity = rt.getForEntity(GET_TICKET_URL, TicketData.class, ticketNumber);
 		TicketData ticketData2 = responseEntity.getBody();
		
		return ticketData2;
	}

}
