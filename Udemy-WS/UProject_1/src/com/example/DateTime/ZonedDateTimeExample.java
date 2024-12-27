package com.example.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
	
	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime : " + zonedDateTime);
		
		System.out.println("getOffset : " + zonedDateTime.getOffset());
		
		System.out.println("getZone : " + zonedDateTime.getZone());
		
		System.out.println("getAvailableZoneIds : " + ZoneId.getAvailableZoneIds());
		

		ZoneId.getAvailableZoneIds().forEach(z -> {
			System.out.println(z);
		});
		
		System.out.println("Total Count of ZoneIds : " + ZoneId.getAvailableZoneIds().size());
		
		System.out.println(ZonedDateTime.now(ZoneId.of("Indian/Reunion")));
		System.out.println(ZonedDateTime.now(ZoneId.of("Indian/Antananarivo")));
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));

	}

}
