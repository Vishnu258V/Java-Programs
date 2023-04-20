package com.FinalAssesment2.java;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int tempNum = number+1;
		
		double sq = Math.sqrt(tempNum);
		//System.out.println(sq);
		
		double tempNum2 =  Math.pow(sq, 2);
		//System.out.println(tempNum2);
		
		
		if(tempNum == tempNum2) {
			System.out.println(number+" - is Sunny Number ");
		}else {
			System.out.println(number+" - Not a Sunny Number ");
		}
				
	}
}
