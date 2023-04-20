package com.FinalAssesment.java;
import java.util.Scanner;

public class CheckingLeapYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year to Check whether its leap year or not  : ");
		int year = sc.nextInt();
		int tempYear = year;

		// to count the no of digits does year contains
		int count = 0;
		while (year > 0) {
			year = year / 10;
			count++;
		}

		if (count == 4) {

				int lastTwoDigits = tempYear % 100;

				if (lastTwoDigits % 4 == 0) {

					System.out.println(tempYear + " - is Leap year");
				} else {

					System.out.println(tempYear + " - Not a Leap year");
				}

		} else {

			System.out.println("Enter the 4 digits to consider the Number as a year");
		}

	}
}
