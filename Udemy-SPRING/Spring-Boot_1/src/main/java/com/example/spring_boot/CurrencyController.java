package com.example.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyServiceConfig config;
	
	@GetMapping("/currency")
	public CurrencyServiceConfig retrieveAllCourses(){
		return config;
	}

}
