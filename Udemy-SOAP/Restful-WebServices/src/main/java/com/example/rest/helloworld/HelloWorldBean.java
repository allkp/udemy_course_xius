package com.example.rest.helloworld;

public class HelloWorldBean {
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + msg + "]";
	}
	
	
	
	public HelloWorldBean(String msg) {
		super();
		this.msg = msg;
	}
	/*
	 * @Bean public String greetByBean() { return msg; }
	 */
	

}
