package Assignment_1BasicProblems;

import java.util.Scanner;
import java.util.TreeSet;

public class RepeatedCharsOfString {
	public static void main(String[] args) {

		System.out.println("Enter the String to check Repeated Characters :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// int temp = 0;

		// I am just using this to make the repeated elements in sorted format and
		// to print Characters without duplicates as well
		TreeSet<Character> tr1 = new TreeSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
					count++;
				}
			}
			if (count > 1) {
				tr1.add(str.charAt(i));
			}

		}

		if (tr1.isEmpty() != true) {
			// Retrieving the elements
			System.out.println("\nThe most repeated Characters are :");
			for (char c : tr1) {
				System.out.print(c + " ");
			}

		} else {
			System.err.println("\nNo Repeated Word Avilable in the String ");
		}

	}
}
