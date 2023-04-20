package Assignment_1BasicProblems;

import java.util.Arrays;
import java.util.Scanner;

// Write the java program to check if the given two strings are anagram to each other or not.
public class AnagramString {
	public static void main(String[] args) {

		System.out.println("Enter the Strings to check Anagram");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		if (s1.length() == s2.length()) {

			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();

			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();

			Arrays.sort(c2);
			Arrays.sort(c1);

			boolean value = Arrays.equals(c1, c2);

			if (value == true) {
				System.out.println("The Strings are Anagram ");
			} else {
				System.out.println("The Strings are Not Anagram ");
			}
		} else {
			System.out.println("The sizes of the Strings are not equal");
		}

	}
}
