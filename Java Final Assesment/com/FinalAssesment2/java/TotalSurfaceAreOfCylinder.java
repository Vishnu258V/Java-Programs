package com.FinalAssesment2.java;

import java.util.Scanner;

public class TotalSurfaceAreOfCylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Radious of Cylinder : ");
		double radious = sc.nextDouble();

		System.out.print("Enter  Height of Cylinder  : ");
		double height = sc.nextDouble();

//		 TSA = 2(22/7)R^2  + 2(22/7)RH

		double power = Math.pow(radious, 2);

		double twoPiRsquare = 2 * (22 / 7) * power;

		double twoPiRH = 2 * (22 / 7) * radious * height;

		double totalSurfaceArea = twoPiRsquare + twoPiRH;

		System.out.println(totalSurfaceArea);

	}

}
