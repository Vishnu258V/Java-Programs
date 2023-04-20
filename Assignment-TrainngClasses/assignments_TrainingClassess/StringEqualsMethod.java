package com.StringManipulation.Examples;

import java.util.Scanner;

public class StringEqualsMethod {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = null;
		
		
		// This is the most preferable way to overcome the NullPointer Exception
		if ("Hello".equals(s2)) {
			System.out.println("2nd statement ");
		} else {
			System.out.println("2nd else statement");
		}

		// This is also a good way but we will get a chance to get Null Pointer exception
		if (s2.equals("Hello")) {
			System.out.println("1st statement ");
		}else {
			System.out.println("st else statement");
		}
		
		
		
	}
}
