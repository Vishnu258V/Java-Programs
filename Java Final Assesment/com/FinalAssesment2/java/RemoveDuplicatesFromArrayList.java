package com.FinalAssesment2.java;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the ArrayList : ");
		int size = sc.nextInt();

		ArrayList<Integer> arrList = new ArrayList<>();
		System.out.println("\nEnter the " + size + " values to the ArrayList : ");
		while (size > 0) {
			int value = sc.nextInt();

			arrList.add(value);
			size--;
		}

		ArrayList<Integer> withoutDuplicates = new ArrayList<>();
		for (Integer i : arrList) {

			if (!(withoutDuplicates.contains(i))) {
				withoutDuplicates.add(i);
			}
		}
		
		arrList.removeAll(arrList);
		arrList.addAll(withoutDuplicates);
		
		System.out.println(arrList);
		
	}
}
