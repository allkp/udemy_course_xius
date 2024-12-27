package com.example.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
	
	public static void parseLocalDate() {
		/**
		 * String to LocalDate
		 */
		String date = "2024-12-04";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate : " + localDate);
		
		LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate1 : " + localDate1);
		
		String date1 = "20241205";
		LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("localDate2 : " + localDate2);
		
		/**
		 * Custom defined DateFormat
		 */
		String date2 = "2024|12|25";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
		System.out.println("localDate3(yyyy|MM|dd) : " + localDate3);
		
		String date3 = "2024*12*25";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter1);
		System.out.println("localDate4(yyyy*MM*dd) : " + localDate4);
		

	}
	
	public static void formatLocalDate() {
		/**
		 * LocalDate to String
		 */
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate date = LocalDate.now();
		String formattedDate = date.format(dateTimeFormatter);
		System.out.println("formattedDate : " + formattedDate);
	}
	
	
	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}

}
