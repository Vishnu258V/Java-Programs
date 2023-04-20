package com.FinalAssesment.java;
import java.util.Scanner;
/*
 	Compound Interest CP = (A-p)
 	A = P*(1+R/n)power(n*t)
 */

public class CompoundIntrest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principle Amount (P) : ");
		double princpleAmmount = sc.nextDouble();
		double P = princpleAmmount;

		System.out.println("Enter rate of Intrest : ");
		double rateOfIntrest = sc.nextDouble();

		System.out.println("Enter no of times Rate of Instrest Increased in Year");
		int noOftimesIncreased = sc.nextInt();

		System.out.println("Enter the time period : ");
		int timePeriod = sc.nextInt();

		// power(n*t)
		double powerValue = noOftimesIncreased * timePeriod;

		// (1+R/n)
		double value = (1 + rateOfIntrest / noOftimesIncreased);

		double mathPowValue = Math.pow(value, powerValue);

		double A = P * mathPowValue;

		double CompountIntrest = A - P;

		System.out.println(CompountIntrest);

	}
}
