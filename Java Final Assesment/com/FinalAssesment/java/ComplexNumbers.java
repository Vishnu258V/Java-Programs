package com.FinalAssesment.java;
import java.util.Scanner;

public class ComplexNumbers {
	// a + ib
	// c + id
	public void sumOfComplexNumbers(int a, int b, int c, int d) {

		int x = a + c;
		int y = c + d;

		System.out.println("\n" + a + " + " + " i" + b);
		System.out.println(c + " + " + " i" + d);
		System.out.println("---------");
		System.out.println(x + " + " + " i" + y);

	}

	public static void main(String[] args) {

		System.out.println("Values from the separate method : ");
		ComplexNumbers c1 = new ComplexNumbers();
		c1.sumOfComplexNumbers(2, 36, 17, 10);
		c1.sumOfComplexNumbers(6, 21, 71, 89);
		c1.sumOfComplexNumbers(24, 31, 67, 56);
		c1.sumOfComplexNumbers(22, 13, 27, 11);


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st complex number in String format");
		String first = sc.next();

		System.out.println("Enter the 2nd complex number in String format");
		String second = sc.next();

		String firstNumber[] = first.split("[\\+]");
		String secondNumber[] = second.split("[\\+]");

		String firstIndex1 = firstNumber[0];
		String secondIndex1 = secondNumber[0];
		String firstIndex2 = firstNumber[1];
		String secondIndex2 = secondNumber[1];

		StringBuffer a = new StringBuffer();
		StringBuffer c = new StringBuffer();
		StringBuffer b = new StringBuffer();
		StringBuffer d = new StringBuffer();

		// System.out.println(firstIndex2);
		// System.out.println(secondIndex2);

		for (int i = 0; i < firstIndex1.length(); i++) {
		if (firstIndex1.charAt(i) >= '0' && firstIndex1.charAt(i) <= '9') {
		a.append(firstIndex1.charAt(i));
		}
		}

		for (int i = 0; i < secondIndex1.length(); i++) {
		if (secondIndex1.charAt(i) >= '0' && secondIndex1.charAt(i) <= '9') {
		c.append(secondIndex1.charAt(i));
		}
		}

		for (int i = 0; i < firstIndex2.length(); i++) {
		if (firstIndex2.charAt(i) >= '0' && firstIndex2.charAt(i) <= '9') {
		b.append(firstIndex2.charAt(i));
		}
		}
		for (int i = 0; i < secondIndex2.length(); i++) {
		if (secondIndex2.charAt(i) >= '0' && secondIndex2.charAt(i) <= '9') {
		d.append(secondIndex2.charAt(i));
		}
		}

		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// System.out.println(d);

		int a1 = Integer.parseInt(a.toString());
		int b1 = Integer.parseInt(b.toString());
		int a2 = Integer.parseInt(c.toString());
		int b2 = Integer.parseInt(d.toString());

		int x = a1 + a2;
		int y = b1 + b2;
		System.out.println("\n" + x + " + " + firstIndex2.charAt(0) + y);

		
		

	}
}
