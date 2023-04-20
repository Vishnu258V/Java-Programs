package com.FinalAssesment2.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertingListToArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the List : ");
		int size = sc.nextInt();
		int tempSize = size;

		System.out.println("Enter the elements into List one by one : ");
		ArrayList<Integer> integerValues = new ArrayList<>();

		while (size > 0) {
			int value = sc.nextInt();
			integerValues.add(value);

			size--;
		}

		Object[] arr = integerValues.toArray();

		int newArry[] = new int[tempSize];

		for (int i = 0; i < arr.length; i++) {
			newArry[i] = (int) arr[i];
		}

		System.out.println("\nConverted Array - ");
		for (int i = 0; i < newArry.length; i++) {
			System.out.print(+newArry[i] + " ");
		}

	}
}
