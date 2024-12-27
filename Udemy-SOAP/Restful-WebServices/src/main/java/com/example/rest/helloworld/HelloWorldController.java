package com.example.rest.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private MessageSource msg_Src;
	
	public HelloWorldController(MessageSource msg_Src) {
		this.msg_Src = msg_Src;
	}
	
	
	@GetMapping("/hello")
	public String greet() {
		return "Hello World....!!!";
	}
	
	@GetMapping("/hello-bean")
	public HelloWorldBean greetBean() {
		return new HelloWorldBean("Hello Bean World....!!!");
	}
	
	@GetMapping("/name/path-variable/{name}")
	public String namePath(@PathVariable String name) {
		return "Hi, " + name;
	}
	
	@GetMapping("/hello-intrn")
	public String internationalizedGreet() {
		
		Locale locale = LocaleContextHolder.getLocale();
		
		return msg_Src.getMessage("good.morning.message", null, "Default Message", locale);
		
	}

}
