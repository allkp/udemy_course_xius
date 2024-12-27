package com.example.defaults;

public class Client14 implements Interface1, Interface4{

	@Override
	public void methodA() {
		System.out.println("This is from Interface-1, Method-A : " + Client14.class);
	}
	
	public static void main(String[] args) {
		Client14 client14 = new Client14();
		client14.methodA();
	}

}
