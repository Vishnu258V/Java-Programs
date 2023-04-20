package com.FinalAssesment2.java;

import java.util.Scanner;

public class ReverseStringWordByWord {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse word by word : ");
		String str = sc.nextLine();

		String arrStr[] = str.split(" ");
		String finalString[] = new String[arrStr.length];
		// StringBuffer sb = new StringBuffer();
		// StringBuffer finalString = new StringBuffer();

		for (int i = 0; i < arrStr.length; i++) {
			String reverse = "";
			char ch;

			if (i % 2 == 0) {

				for (int j = (arrStr[i].length() - 1); j >= 0; j--) {
					ch = arrStr[i].charAt(j);
					reverse = reverse + ch;
				}
				finalString[i] = reverse;
			} else {
				finalString[i] = arrStr[i];
			}

		}

		System.out.println("\nBefore Modification  -> ");
		for (String s : arrStr) {
			System.out.print(s + " ");
		}

		System.out.println();
		
		System.out.println("After Modification  -> ");
		for (String s : finalString) {
			System.out.print(s + " ");
		}

	}
}
