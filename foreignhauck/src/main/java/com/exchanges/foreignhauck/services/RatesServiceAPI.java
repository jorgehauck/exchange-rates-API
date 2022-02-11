package com.exchanges.foreignhauck.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://data.fixer.io/api/", name = "fixer.io")
public interface RatesServiceAPI {

	@GetMapping(value = "latest?access_key=ca996dc48aa4411b9de0ad8466403701")
	RatesService findAll();
}
