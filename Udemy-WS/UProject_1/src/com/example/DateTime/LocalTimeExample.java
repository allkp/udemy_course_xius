package com.example.DateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);
		
		LocalTime localTime1 = LocalTime.of(20, 30);
		System.out.println("localTime1 : " + localTime1);
		
		LocalTime localTime2 = LocalTime.of(20, 30, 33);
		System.out.println("localTime2 : " + localTime2);
		
		LocalTime localTime3 = LocalTime.of(20, 30, 33, 32456546);
		System.out.println("localTime3 : " + localTime3);
		
		System.out.println("getHour : " + localTime.getHour());
		System.out.println("getMinute : " + localTime.getMinute());
		System.out.println("CLOCK_HOUR_OF_DAY : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());
		
		/**
		 * Modify the values of LocalTime 
		 */
		System.out.println("minusHours : " + localTime.minusHours(2));
		System.out.println("ChronoUnit minusHours : " + localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
		System.out.println("MIDNIGHT : " + localTime.with(LocalTime.MAX));
		System.out.println("HOUR_OF_DAY : " + localTime.with(ChronoField.HOUR_OF_DAY, 2));
		
		System.out.println("plusMinutes : " + localTime.plusMinutes(30));
		System.out.println("withHour : " + localTime.withHour(10));

		
		
	}
	
}
