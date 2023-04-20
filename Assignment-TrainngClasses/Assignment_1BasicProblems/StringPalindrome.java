package Assignment_1BasicProblems;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		System.out.println("Enter the String to Check weather its Palindrome or Not");

		Scanner sc = new Scanner(System.in);

		// Taking input from keyboard
		String str = sc.next();
		str = str.toUpperCase();

		String reverse = "";

		for (int i = (str.length() - 1); i >= 0; i--) {

			char c = str.charAt(i);
			reverse = c + reverse;
		}

		if (reverse.toUpperCase().equals(str)) {
			System.out.println(str + " - is a Palindrom String");
		} else {
			System.err.println(str + " - is not a Palindrom String");
		}

	}

}
