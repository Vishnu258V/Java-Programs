package com.FinalAssesment2.java;

import java.util.InputMismatchException;
import java.util.Scanner;

//122 = 1^3+2^3+2^3 = 17
public class AmstrongNumberChecking {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number to check Amstrong Number : ");
		int correctAnswer = 0;
		while (correctAnswer != 1) {

			int number;
			try {
				number = sc.nextInt();
			} catch (Exception e) {

				throw new InputMismatchException("Please Enter Integer Values only  ");
			}

			int remain = 0;
			int count = 0;
			int sum = 0;
			int temp = number;
			int temp2 = number;

			// to count no of digits to consider as power value
			while (number > 0) {
				number = number / 10;
				count++;
			}
			while (temp > 0) {
				remain = temp % 10;
				temp = temp / 10;
				// System.out.println(Math.pow(remain, count));
				sum = sum + (int) Math.pow(remain, count);
			}
			if (sum == temp2) {
				System.out.println(temp2 + " is An Amstrong Number");
				correctAnswer = 1;
			} else {
				System.out.println(temp2 + " is Not An Amstrong Number");
			}

			if (correctAnswer != 1) {
				System.out.println("\n\nEnter the Number to check again  : ");
			}

		}

	}
}
