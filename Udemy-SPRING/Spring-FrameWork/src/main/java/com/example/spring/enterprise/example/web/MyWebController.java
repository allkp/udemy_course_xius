package com.example.spring.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	
	@Autowired
	private BusinessService service;

	public long returnValueFromBusinessService() {
		return service.calculateSum();
	}
	
}

