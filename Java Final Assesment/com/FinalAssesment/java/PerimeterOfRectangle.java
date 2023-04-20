package com.FinalAssesment.java;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length(l) of the rectangle : ");
		double length = sc.nextDouble();

		System.out.print("Enter the Breadth(b) of the rectangle : ");
		double breadth = sc.nextDouble();

		double perimeter = 2 * (length + breadth);

		System.out.println("\nPerimeter = " + perimeter + " mm");
		
	}
}
