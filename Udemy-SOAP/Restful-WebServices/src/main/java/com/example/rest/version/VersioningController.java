package com.example.rest.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {
	
	/*
	 * URI-Versioning
	 */
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Bob Marley.........");
	}
	
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new NameBean("Lokesh", "Adireddy"));
	}
	
	/*
	 * Request-Parameter Versioning
	 */
	@GetMapping(path="/person", params = "version=v1")
	public PersonV1 getFirstVersionOfPersonParamsV1() {
		return new PersonV1("Bob Marley.........");
	}
	
	@GetMapping(path="/person", params = "version=v2")
	public PersonV2 getSecondVersionOfPersonParamsV2() {
		return new PersonV2(new NameBean("Lokesh", "Adireddy"));
	}
	
	
	
	/*
	 *  Request(Custom)-Header Versioning
	 */	
	@GetMapping(path="/person/header", headers = "X-API-Version=v1")
	public PersonV1 getFirstVersionOfPersonHeadersV1() {
		return new PersonV1("Bob Marley.........");
	}
	
	@GetMapping(path="/person/header", headers = "X-API-Version=v2")
	public PersonV2 getSecondVersionOfPersonHeadersV2() {
		return new PersonV2(new NameBean("Lokesh", "Adireddy"));
	}
	
	
	
	/*
	 * Media-Type Versioning
	 */
	@GetMapping(path="/person/accept", produces = "application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeadersV1() {
		return new PersonV1("Bob Marley.........");
	}
	
	@GetMapping(path="/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getFirsSecondVersionOfPersonAcceptHeadersV2() {
		return new PersonV2(new NameBean("Lokesh", "Adireddy"));
	}
	

}
