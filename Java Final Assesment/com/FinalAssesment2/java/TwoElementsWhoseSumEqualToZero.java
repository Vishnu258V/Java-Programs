package com.FinalAssesment2.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TwoElementsWhoseSumEqualToZero {

	public static void main(String[] args) {

		System.out.print("Enter the No Of elements : ");
		Scanner sc = new Scanner(System.in);
		Integer noOfElements = sc.nextInt();

		ArrayList<Integer> arrList = new ArrayList<>();

		while (noOfElements > 0) {
			Integer elements = sc.nextInt();
			arrList.add(elements);
			noOfElements--;
		}

		HashMap<Integer, String> map = new HashMap<>();
		// HashMap<Integer, Integer> IandJvalues = new HashMap<>();

		for (Integer i = 0; i < arrList.size(); i++) {
			for (Integer j = 0; j < arrList.size(); j++) {

				// to overcome the addition of a same index again
				if (i != j) {
					Integer sum = 0;
					sum = arrList.get(i) + arrList.get(j);
					map.put(sum, (arrList.get(i) + " + " + arrList.get(j)));
				}
			}
		}
		
		System.out.println("\nValues from the Addition of the Elements ");
		for (int i : map.keySet()) {
			System.out.println(i + " = " + map.get(i));
		}

		// Sorting the HashMap to get least number which is nearest to zero
		TreeMap<Integer, String> tr1 = new TreeMap<>(map);
		System.out.println("\nTwo elements Whose sum is nearest to Zero ->  \n" + tr1.get(tr1.firstKey()) + " = "
				+ tr1.firstKey());

		
	}
}
