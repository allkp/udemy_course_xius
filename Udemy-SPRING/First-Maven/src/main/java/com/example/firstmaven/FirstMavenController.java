package com.example.firstmaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstMavenController {

	@GetMapping("/greet")
	public String getString() {
		return "Hi, Lokesh....!!!";
	}
	
}
