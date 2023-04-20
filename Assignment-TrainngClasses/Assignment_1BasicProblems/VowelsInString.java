package Assignment_1BasicProblems;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class VowelsInString {

	public static void main(String[] args) {

		System.out.println("Enter the String to Check all the Vowels  :");

		// to store and eliminates the duplicates
		LinkedHashSet<Character> li = new LinkedHashSet<>();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String temp = str;

		// A E I O U vowels
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
			 || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
			 || str.charAt(i) == 'O' || str.charAt(i) == 'U') {

				li.add(str.charAt(i));
			}
		}

		// to get Sorted format
		TreeSet<Character> tr = new TreeSet<>(li);
		System.out.println("\nVowels are  :");

		for (char c : tr) {
			System.out.print(c + " ");
		}

	}
}
