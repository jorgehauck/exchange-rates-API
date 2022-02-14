package com.exchanges.foreignhauck.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RatesServiceJSON {
	
	private Boolean success;
	private Integer timestamp;
	private String base;
	private String date;
	
	private Rates rates;
}
