package com.exchanges.foreignhauck.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatesService {

	@Autowired
	private RatesServiceAPI ratesServiceAPI;
	
	
	public RatesServiceJSON findAll() {
		
		RatesServiceJSON serviceJSON = ratesServiceAPI.findAll();
		
		return serviceJSON;
	}
	
	public RatesServiceJSON findBySymbols(String symbols) {
		
		RatesServiceJSON serviceJSON = ratesServiceAPI.findByBaseSymbols(symbols);
		
		return serviceJSON;
	}
}
