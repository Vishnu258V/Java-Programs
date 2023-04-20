package Assignment_1BasicProblems;

import java.util.Scanner;

public class ReverseANumberByString {
	
	public static void main(String[] args) {	
		
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		// StringBufffer has a Predefined method to reverse String 
			StringBuffer number = new StringBuffer(a+"");
			number.reverse();

			
		// After StringBuffer we Assign the value to String by using  toString(); method
			String new1 = number.toString();
		
			
		// This is to convert String to Integer
			Integer i = Integer.parseInt(new1);
			System.out.println(i);
		
	
			
	}
}
