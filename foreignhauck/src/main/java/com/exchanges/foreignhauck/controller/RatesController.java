package com.exchanges.foreignhauck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exchanges.foreignhauck.services.RatesService;
import com.exchanges.foreignhauck.services.RatesServiceJSON;

@RestController
@RequestMapping(value = "/currencys")
public class RatesController {

	@Autowired
	private RatesService ratesService;

	@GetMapping
	public ResponseEntity<RatesServiceJSON> findAll() {

		RatesServiceJSON serviceJSON = ratesService.findAll();

		return ResponseEntity.ok().body(serviceJSON);
	}
	
	@GetMapping(value = "{symbols}")
	public ResponseEntity<RatesServiceJSON> findBySymbols(@PathVariable String symbols) {
		
		RatesServiceJSON serviceJSON = ratesService.findBySymbols(symbols);
		
		return ResponseEntity.ok().body(serviceJSON);
	}
	
}
