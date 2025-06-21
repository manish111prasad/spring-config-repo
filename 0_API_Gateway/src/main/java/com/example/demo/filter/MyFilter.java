package com.example.demo.filter;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import io.netty.handler.codec.Headers;
import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Filter Executed....");
		
		ServerHttpRequest request =  exchange.getRequest();		//capture the complete request coming from the browser
		
	    HttpHeaders headers =	request.getHeaders();
		
		Set<String> keySet = headers.keySet();
		
		for(String key : keySet) {
			System.out.println(key+"----");
			System.err.println(headers.getValuesAsList(key));
		}
		
		return chain.filter(exchange);
	}

}
