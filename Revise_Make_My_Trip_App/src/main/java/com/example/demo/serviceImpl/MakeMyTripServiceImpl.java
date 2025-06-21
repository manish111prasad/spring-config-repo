package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.binding.Passenger;
import com.example.demo.response.Ticket;
import com.example.demo.service.MakeMyTripService;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	private String BOOK_TICKET_URL = "http://13.232.253.164:8080/ticket";
	private String GET_TICKET_URL = "http://13.232.253.164:8080/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {

		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post().uri(BOOK_TICKET_URL).bodyValue(passenger).retrieve().bodyToMono(Ticket.class)
				.block();

		return ticket;

		/*
		 * RestTemplate rest = new RestTemplate(); ResponseEntity<Ticket> responseEntity
		 * = rest.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
		 * 
		 * Ticket ticket = responseEntity.getBody();
		 * 
		 * return ticket;
		 */
	}

	@Override
	public Ticket geTicket(Ticket ticketNum) {  

		WebClient webClient = WebClient.create();

		Ticket ticket = webClient.get().uri(GET_TICKET_URL, ticketNum).retrieve().bodyToMono(Ticket.class).block();

		/*
		 * RestTemplate restTemplate = new RestTemplate(); ResponseEntity<Ticket>
		 * responseEntity = restTemplate.getForEntity(GET_TICKET_URL, Ticket.class,
		 * ticketNum); Ticket ticket = responseEntity.getBody();
		 * 
		 * 
		 * return ticket;
		 */
		return ticket;
	}

}
