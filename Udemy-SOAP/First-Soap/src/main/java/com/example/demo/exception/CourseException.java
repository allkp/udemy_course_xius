package com.example.demo.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://soap.udemy.com/courses}COURSE_NOT_FOUND")
public class CourseException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourseException(String msg) {
		super(msg);
	}
	
	
	

}
