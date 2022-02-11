package com.exchanges.foreignhauck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exchanges.foreignhauck.services.RatesService;
import com.exchanges.foreignhauck.services.RatesServiceAPI;

@RestController
@RequestMapping(value = "/currencys")
public class RatesController {

	@Autowired
	private RatesServiceAPI ratesServiceAPI;
	
	@GetMapping
	public ResponseEntity<RatesService> findAllRates() {
		
		RatesService service = ratesServiceAPI.findAll();
		
		return ResponseEntity.ok().body(service);
	}
	
	@GetMapping(value = "/{symbols}")
	public ResponseEntity<RatesService> findByBase(@PathVariable String symbols) {
		
		RatesService service = ratesServiceAPI.findByBaseSymbols(symbols);
		
		return ResponseEntity.ok().body(service);
	}
}
