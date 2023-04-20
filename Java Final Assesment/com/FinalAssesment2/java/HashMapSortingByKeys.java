package com.FinalAssesment2.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapSortingByKeys {

	public static void main(String[] args) {

		System.out.print("Enter the size of the HashMap : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		HashMap<Integer, String> map1 = new HashMap<>();

		while (size > 0) {
			System.out.println("Enter the key value pair :");
			int key = sc.nextInt();
			String value = sc.next();

			map1.put(key, value);

			size--;
		}

		TreeMap<Integer, String> tr1 = new TreeMap<>(map1);

		for (Integer i : tr1.keySet()) {

			System.out.println(i + " = " + tr1.get(i));

		}

	}
}
