package com.FinalAssesment2.java;

import java.util.Scanner;

public class RemoveWhiteSpacesFromTheString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Remove the White Spaces : ");
		String str = sc.nextLine();
		String tempStr = str;

		// 1st method
		str = str.replace(" ", "");
		System.out.println("\nBy using replace method  - " + str);

		// 2nd method
		String arrStr[] = tempStr.split(" ");
		StringBuffer sb = new StringBuffer();

		for (String s : arrStr) {
			sb.append(s);
		}

		System.out.println("\nBy using the Split method - " + sb);

	}
}
