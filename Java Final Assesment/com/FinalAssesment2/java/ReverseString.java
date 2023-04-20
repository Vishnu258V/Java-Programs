package com.FinalAssesment2.java;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	
		System.out.println("Enter the String to be Reversed : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		// predefined method
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("\nBy using predefined method -> " + sb);
	
		
		// Another method
		StringBuffer sb2 = new StringBuffer();
		for (int i = (s.length() - 1); i >= 0; i--) {
			sb2.append(s.charAt(i));
		}
		System.out.println("\nBy using loop -> " + sb2);
	
		
		
	}
}
