package com.FinalAssesment2.java;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Natural Numbers : ");
		int numbers = sc.nextInt();

		// By using formula
		int sumFormula = (numbers * (numbers + 1)) / 2;
		System.out.println("\nSum of Natural Numbers by using formula - " + sumFormula);

		
		// By using Loops
		int sum = 0;
		for (int i = 1; i <= numbers; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of Natural Numbers by using loop    - " + sum);

	}
}
