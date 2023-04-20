package com.FinalAssesment.java;
import java.util.Scanner;

// Swap Two Numbers 
public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number : ");
		int firstNumber = sc.nextInt();
		
		System.out.print("Enter the 2nd Number : ");
		int secondNumber = sc.nextInt();
		
		System.out.println("\nBefore swap :- \nFirst Number : "+firstNumber+"\nSecond Number : "+secondNumber);
		
		int tempVar = 0;
		tempVar = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tempVar;
		
		System.out.println("\nAfter swap :- \nFirst Number : "+firstNumber+"\nSecond Number : "+secondNumber);
		
		
	}
}
