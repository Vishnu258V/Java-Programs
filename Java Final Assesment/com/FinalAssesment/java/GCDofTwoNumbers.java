package com.FinalAssesment.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GCDofTwoNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int first = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int second = sc.nextInt();

		ArrayList<Integer> factorsFirst = new ArrayList<>();
		ArrayList<Integer> factorsSecond = new ArrayList<>();
		ArrayList<Integer> sameFactors = new ArrayList<>();

		for (int i = 1; i <= first; i++) {
			if (first % i == 0) {
				factorsFirst.add(i);
			}
		}

		for (int j = 1; j <= second; j++) {
			if (second % j == 0) {
				factorsSecond.add(j);
			}
		}

		for (int i = 0; i < factorsFirst.size(); i++) {
			if (factorsSecond.contains(factorsFirst.get(i))) {
				sameFactors.add(factorsFirst.get(i));
			}
		}

		for (int i = 0; i < factorsSecond.size(); i++) {
			if (factorsFirst.contains(factorsSecond.get(i))) {
				sameFactors.add(factorsSecond.get(i));
			}
		}
		Collections.sort(sameFactors);
		System.out.println("\nGCD of two numbers is : " + sameFactors.get(sameFactors.size() - 1));

		
		// Another way
		//------------
		int gcd = 1;
		for (int i = 1; i <= first || i <= second; i++) {
			if (first % i == 0 && second % i == 0) {

				gcd = i;
			}
		}
		System.out.println("GCD of two numbers is : " + gcd);
	}
}
