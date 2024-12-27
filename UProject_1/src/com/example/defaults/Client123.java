package com.example.defaults;

public class Client123 implements Interface1, Interface2, Interface3{
	
	public void methodA() {
		System.out.println("This is from Interface-1, Method-A : " + Client123.class);
	}
	
	public static void main(String[] args) {
		
		Client123 client123 = new Client123();			//resolve to the child implementation
		client123.methodA();
		client123.methodB();
		client123.methodC();
		
	}

}
