package com.FinalAssesment2.java;
import java.util.Scanner;
/* 
In fibonacci series, next number is the sum of previous two numbers for 
example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1

*/
public class FibonocciNumber {
	public static void main(String[] args) {

		System.out.print("Enter the size of elements to create fibonocci series : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;

		while (num > 0) {
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
			System.out.print(thirdNum+" ");
			num--;
		}
	}
}