package com.example.demo.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {

	private String code;
	private String msg;
	private LocalDateTime when;

}
