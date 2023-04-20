package Assignment_1BasicProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Paragraph can be just one sentence long.

public class SmallestWordInParagraph {

	public static void main(String[] args) {

		System.out.println("Enter the Paragraph to find the small word among those  :");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2[] = s1.split(" ");

		Map<Integer, String> m1 = new HashMap<Integer, String>();

		for (String s : s2) {

			m1.put(s.length(), s);
		}

		TreeMap<Integer, String> tr1 = new TreeMap<>(m1);
//		for (Integer key : m1.keySet()) {
//			System.out.println(key + " = " + m1.get(key));
//		}

		System.out.println("\nThe smallest word in paragraph  :" + tr1.get(tr1.firstKey()));
		System.out.println("\nThe Largest word in paragraph   :" + tr1.get(tr1.lastKey()));

	}
}
