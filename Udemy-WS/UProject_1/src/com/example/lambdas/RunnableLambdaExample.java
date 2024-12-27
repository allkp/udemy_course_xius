package com.example.lambdas;

public class RunnableLambdaExample {
	
	
	public static void main(String[] args) {
		/**
		 * prior java-1.8
		 */
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside the Runnable 1");
			}
		};
		
		new Thread(runnable).start();
		
		/**
		 * java-8 lambda
		 */
		
		// () -> {};
		
		Runnable runnableLambda = () -> {
			System.out.println("Inside the Runnable 2");
		};
		
		new Thread(runnableLambda).start();
		
		new Thread(() -> System.out.println("Inside the Runnable 3")).start();
	}

}
