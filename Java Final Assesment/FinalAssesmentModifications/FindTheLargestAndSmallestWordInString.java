package FinalAssesmentModifications;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;

public class FindTheLargestAndSmallestWordInString {
	public static void main(String[] args) {

		System.out.println("Enter the String to check smallest and largest words : ");
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String s2[] = s1.split("\\s");

		ArrayList<String> strList = new ArrayList<>();
		System.out.println();
		for (int i = 0; i < s2.length; i++) {

			if (!(s2[i].equals(""))) {
				strList.add(s2[i]);
			}
		}
		// System.out.println(strList.size());
		Map<Integer, String> m1 = new HashMap<Integer, String>();

		for (String s : strList) {
			m1.put(s.length(), s);
		}

		TreeMap<Integer, String> tr1 = new TreeMap<>(m1);
//		for (Integer key : m1.keySet()) {
//			System.out.println(key + " = " + m1.get(key));
//		}

		try {

			System.out.println("\nThe smallest word in paragraph  :" + tr1.get(tr1.firstKey()));
			System.out.println("\nThe Largest word in paragraph   :" + tr1.get(tr1.lastKey()));

		} catch (Exception e) {

			throw new NoSuchElementException(
					"\n->Please Enter atlest two String words :  \n->No elements found in the Given String :");
		}

//		ArrayList<String> arrList = new ArrayList<>();
//		String largest = " ";
//		String smallest = " ";
//		for (String s : s2) {
//			if (s.length() >= largest.length()) {
//				largest = s;
//
//				arrList.add(largest);
//			}
//			if (s.length() < smallest.length()) {
//				smallest = s;
//				smallest = s.length();
//			}
//		}
//		System.out.println(arrList);
//		System.out.println(largest);
//		System.out.println(smallest);

	}
}
