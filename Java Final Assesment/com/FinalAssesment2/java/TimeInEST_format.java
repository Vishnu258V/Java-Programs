package com.FinalAssesment2.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeInEST_format {

	public static void main(String[] args) {

		Date date = new Date();  
//		System.out.println(date);

		DateFormat formatter = new SimpleDateFormat("HH:mm:ss a");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));  
		String s = formatter.format(date);
		System.out.println(s);
	
//	LocalDateTime local = LocalDateTime.now();
//	ZoneId zoneid = ZoneId.of(TimeZone.getTimeZone("EST"));
//	
//	DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:ss");
//	
//	ZonedDateTime zone = ZonedDateTime.now();
//	ZonedDateTime newFormat =	zone.withZoneSameInstant(zoneid);
//	String est  = newFormat.format(dt);
//	System.out.println(est);
	
		
	}
}
