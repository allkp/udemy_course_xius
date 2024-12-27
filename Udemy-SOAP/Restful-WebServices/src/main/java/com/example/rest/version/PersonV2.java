package com.example.rest.version;


public class PersonV2 {
	
	private NameBean name;

	
	public PersonV2(NameBean name) {
		super();
		this.name = name;
	}

	public NameBean getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}
	
	

}
