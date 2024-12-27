package com.example.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//java.util.Date
		Date date = new Date();
		System.out.println("date : " + date);
		
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("localDate : " + localDate);
		
		Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("date1 : " + date1);
		
		java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("java.sql.date is : " + date2);


        LocalDate localDate2 = date2.toLocalDate();
        System.out.println("converted Local Date : " + localDate2);
	}
	
}
