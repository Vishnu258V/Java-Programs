package com.FinalAssesment2.java;

import java.util.Scanner;

public class StringPalindromeChecking {
	public static void main(String[] args) {

		System.out.println("Enter the String to be Reversed : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		s = s.toUpperCase();
		// predefined method
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();

		if (s.contentEquals(sb)) {
			System.out.println(s + " - is a Palindrome");
		} else {
			System.out.println(s + " - Is Not a Palindrome");
		}

	}
}
