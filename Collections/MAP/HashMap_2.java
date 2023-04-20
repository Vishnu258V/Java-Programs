package com.MAP;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_2 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1046, "Vishnu");
		hm.put(1047, "Anji");
		hm.put(1048, "Kavya");
		hm.put(1049, "Rohan");
		hm.put(1050, "Prathibha");


		System.out.println(hm.containsKey(258));

		
		// 1st method
		Set<Integer> s1 = hm.keySet();

		for (int i : s1) {
			System.out.println(i + " = " + hm.get(i));
		}

		System.out.println("\n");

		// 2nd Method
		Set<Map.Entry<Integer, String>> value = hm.entrySet();

		for (Entry<Integer, String> m : value) {

			System.out.println(m.getKey() + " = " + m.getValue());
		}

		System.out.println("\n");

		// 3rd Method
		Set<Map.Entry<Integer, String>> list = hm.entrySet();

		Iterator<Entry<Integer, String>> itr = list.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		
	}
}
