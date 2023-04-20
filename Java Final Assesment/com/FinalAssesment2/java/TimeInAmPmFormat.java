package com.FinalAssesment2.java;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeInAmPmFormat {
	public static void main(String[] args) {

		LocalDateTime local = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
		String ampm = formatter.format(local);
		System.out.println(ampm);
	
	}
}
