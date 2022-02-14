package com.exchanges.foreignhauck.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://data.fixer.io/api/", name = "fixer.io")
public interface RatesServiceAPI {

	@GetMapping(value = "latest?access_key=ca996dc48aa4411b9de0ad8466403701")
	RatesServiceJSON findAll();
	
	@GetMapping(value = "latest?access_key=ca996dc48aa4411b9de0ad8466403701&symbols={symbols}")
	RatesServiceJSON findByBaseSymbols(@PathVariable String symbols);
}
