package Assignment_1BasicProblems;

import java.util.Scanner;

// 145 is the Strong Number, just checking purpose
public class StrongNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number to check Strong Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;

		while (num > 0) {
			int remainder = 0;
			int factorial = 1;
			remainder = num % 10;

				for (int i = remainder; i >= 1; i--) {
					factorial = factorial * i;
				}
			sum = factorial + sum;
			num = num / 10;
		}
		
		if(sum == temp) {
			System.out.println(temp +"  is Strong Number ");
		}else {
			System.out.println(temp +"  is Not a Strong Number ");
		}
		
		
	}
}
