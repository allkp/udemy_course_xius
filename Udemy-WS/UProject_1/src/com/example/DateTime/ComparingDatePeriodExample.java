package com.example.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatePeriodExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2024, 12, 5);
		LocalDate date1 = LocalDate.of(2024, 12, 25);
		
		Period period = date.until(date1);
		System.out.println("getDays : " + period.getDays());
		System.out.println("getMonths : " + period.getMonths());
		System.out.println("getYears : " + period.getYears());

		Period period1 = Period.ofDays(25);
		System.out.println("getDays : " + period1.getDays());

		Period period2 = Period.ofYears(25);
		System.out.println("getYears : " + period2.getYears());
		System.out.println("toTotalMonths : " + period2.toTotalMonths());
		
		Period period3 = Period.between(date, date1);
		System.out.println("Period : " + period3.getDays() + " : " + period3.getMonths() + " : " + period3.getYears());

		
		
	}
	
}
