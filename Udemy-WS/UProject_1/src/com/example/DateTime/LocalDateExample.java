package com.example.DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);
		
		LocalDate localDate1 = LocalDate.of(2024, 12, 5);
		System.out.println("localDate1 : " + localDate1);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2024, 366);
		System.out.println("localDate2 : " + localDate2);
		
		/**
		 * Get values from LocalDate
		 */
		
		System.out.println("getMonth : " + localDate.getMonth());
		System.out.println("getMonthValue : " + localDate.getMonthValue());
		System.out.println("getYear : " + localDate.getYear());
		System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
		System.out.println("getDayOfMonth : " + localDate.getDayOfMonth());
		System.out.println("getDayOfYear : " + localDate.getDayOfYear());
		System.out.println("DAY_OF_MONTH : " + localDate.get(ChronoField.DAY_OF_MONTH));
		
		/**
		 * Modifying Local Date
		 */
		System.out.println("plusDays : " + localDate.plusDays(3));
		System.out.println("plusMonths : " + localDate.plusMonths(3));
		System.out.println("minusDays : " + localDate.minusDays(5));
		System.out.println("withYear : " + localDate.withYear(2019));
		System.out.println("ChronoField.YEAR : " + localDate.with(ChronoField.YEAR, 2025));
		
		System.out.println("firstDayOfNextMonth : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		System.out.println("ChronoUnit.DAYS Minus : " + localDate.minus(1, ChronoUnit.DAYS));

		System.out.println("isLeapYear : " + localDate.isLeapYear());
		System.out.println("isLeapYear : " + LocalDate.ofYearDay(2025, 2).isLeapYear());
		
		System.out.println("isEqual : " + localDate.isEqual(localDate2));
		System.out.println("isBefore : " + localDate.isBefore(localDate2));
		System.out.println("isAfter : " + localDate2.isAfter(localDate));

		/**
		 * Supported
		 */
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.DAYS));
		
		/**
		 * UnSupported 
		 */
		System.out.println("ChronoUnit.MINUTES : " + localDate.minus(1, ChronoUnit.MINUTES));
		
		
		
	}
	
}
