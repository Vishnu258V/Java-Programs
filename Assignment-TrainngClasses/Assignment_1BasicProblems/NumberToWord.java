package Assignment_1BasicProblems;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[] args) {
		
		System.out.println("Enter the number -");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.print(n);
		
		// Object created of class Conversion
		Conversion nw = new Conversion();
		nw.Word((n / 1000000000), " Hundred");
		nw.Word((n / 10000000) % 100, " crore");
		nw.Word(((n / 100000) % 100), " lakh");
		nw.Word(((n / 1000) % 100), " thousand");
		nw.Word(((n / 100) % 10), " hundred");
		nw.Word((n % 100), " ");
		
		
	}
}

class Conversion {

	void Word(int n, String ch) {
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };

		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty",
				" Ninety" };

		
		
		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(ch);
	}
}