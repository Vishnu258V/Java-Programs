package com.FinalAssesment.java;

import java.util.Scanner;

public class LCMofTwoNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int first = sc.nextInt();
		System.out.println("Enter the second number : ");
		int second = sc.nextInt();

		int max = 0;
		int min = 0;
		if (first > second) {
			min = second;
			max = first;
		} else if (second > first) {
			min = first;
			max = second;
		} else {
			max = second;
		}

		if (first == second) {

			System.out.println("Lcm of Two Numbers is : " + max);

		} else if ((first % min == 0 && second % min == 0)) {
			System.out.println("Lcm of Two Numbers is : " + max);

		} else {

			while (!(max % first == 0 && max % second == 0)) {

				++max;
			}
			System.out.println("Lcm of Two Numbers is : " + max);
		}

	}
}
