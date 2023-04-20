package Assignment_1BasicProblems;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

// no of times a character is repeated  => 

public class NoOfTimesCharRepeated {

	public static void main(String[] args) {

		System.out.println("Enter the String to check No of times Characters Repeated :");

		HashMap<Character, Integer> hm = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// int count = 0;

		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) & str.charAt(i) != ' ') {
					count++;
				}
			}

			if (count > 1) {
				hm.put(str.charAt(i), count);
			}
		}

		// System.out.println(hm.entrySet());
		Set<Character> s1 = hm.keySet();

		if (hm.isEmpty() != true) {
			System.out.println("\n");
			for (Character i : s1) {
				System.out.println(i + " = " + hm.get(i) + " Times Repeated");
			}

		} else {
			System.err.println("\nNo Repeated items In the String ");
		}

	}
}
