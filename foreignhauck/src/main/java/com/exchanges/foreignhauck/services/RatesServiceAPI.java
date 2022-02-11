package com.exchanges.foreignhauck.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://data.fixer.io/api/latest?access_key=ca996dc48aa4411b9de0ad8466403701", name = "fixer")
public interface RatesServiceAPI {

	@GetMapping(value = "&base")
	List<RatesService> findAll(@PathVariable("symbols") String base);
}
