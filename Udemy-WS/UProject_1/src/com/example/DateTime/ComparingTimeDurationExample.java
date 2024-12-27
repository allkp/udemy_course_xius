package com.example.DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {
	
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(7, 25);
		LocalTime time1 = LocalTime.of(8, 25);
		
		long diff = time.until(time1, ChronoUnit.MINUTES);
		System.out.println("diff : " + diff);
		
		Duration duration = Duration.between(time, time1);
		System.out.println("toMinutes : " + duration.toMinutes());
		
		Duration duration1 = Duration.ofHours(4);
		System.out.println("toMinutes : " + duration1.toMinutes());
		
		LocalDate date = LocalDate.now();
		LocalDate date1 = LocalDate.now().plusDays(25);
		Duration duration2 = Duration.between(date, date1);
		System.out.println("duration2 : " + duration2);
		
	}
	
}
