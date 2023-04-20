package assignments_TrainingClassess;

import java.util.*;

public class ReverseA_String {

	public static void main(String[] args) {

		System.out.println("Enter the String to Check weather its Palindrome or Not");

		Scanner sc = new Scanner(System.in);

		// Taking input from keyboard
		String str = sc.next();

		System.out.println("\n");

		// This is a predefine method in StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();

		if(str.contentEquals(sb)) {
			System.out.println(sb + " - is Palindrome With Predefine Method");
		}else {
			System.out.println("Its not a Palindrome");
		}
		
		
		
		// Another method by without using Predefine Method
		String name = str;
		String reverse = "";
		char ch;

		for (int i = (name.length() - 1); i >= 0; i--) {
			ch = name.charAt(i);
			reverse += ch;
		}
		if(reverse.equals(str)) {
			System.out.println(reverse + " - is Palindrome Without Predefine Method");
		}else {
			System.out.println("Its not a Palindrome");
		}
	}
}
