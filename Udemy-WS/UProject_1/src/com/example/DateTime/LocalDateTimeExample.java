package com.example.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
	
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("dateTime : " + dateTime);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2024, 12, 10, 5, 30, 50, 665456566);
		System.out.println("dateTime1 : " + dateTime1);
		
		LocalDateTime dateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("dateTime2 : " + dateTime2);
		
		/**
		 * Getting the time and date from LocalDateTime Instance
		 */
		System.out.println("getHour : " + dateTime.getHour());
		System.out.println("getMinute : " + dateTime.getMinute());
		System.out.println("getDayOfMonth : " + dateTime.getDayOfMonth());
		System.out.println("DAY_OF_MONTH : " + dateTime.get(ChronoField.DAY_OF_MONTH));
		
		/**
		 * Modifying the LocalDateTime
		 */
		System.out.println("plusHours : " + dateTime.plusHours(2));
		System.out.println("minusDays : " + dateTime.minusDays(2));
		System.out.println("withMonth : " + dateTime.withMonth(2));

		/**
		 * Converting LocalDate, LocalTime to LocalDateTime and viceversa
		 */
		LocalDate localDate = LocalDate.of(2024, 12, 3);
		System.out.println("atTime : " + localDate.atTime(2, 0));
		
		LocalTime localTime = LocalTime.of(2, 30);
		System.out.println("atDate : " + localTime.atDate(localDate));
		
		LocalDateTime dateTime3 = localTime.atDate(localDate);
		System.out.println("toLocalDate : " + dateTime3.toLocalDate());
		System.out.println("toLocalTime : " + dateTime3.toLocalTime());






		
	}

}
