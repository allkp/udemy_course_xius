package com.example.rest.version;


public class NameBean {
	
	private String first_name;
	
	private String last_name;

	public NameBean(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	@Override
	public String toString() {
		return "NameBean [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	

}
