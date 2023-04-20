package assignments_TrainingClassess;

import java.util.*;

public class PrimeNumber_2 {

	public static void main(String[] args) {

		System.out.println(" Enter the number to check weather it is a Prime or Not");
		Scanner sc = new Scanner(System.in);

		Integer number = sc.nextInt();
		Integer count = 0;

		if (number == 2) {
			System.out.println(number + " is a Even Prime Number");

		} else if (number >= 1) {
			for (int i = 1; i <= number; i++) {

				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(number + " is Prime Number");
			} else {
				System.out.println(number + " is Not a Prime Number");
			}
			
		} else if (number < 0) {
			System.out.println(" Enter only Positive Numbers");
			
		} else {
			System.out.println(number + "is wrong Number \n enter proper number");
		}

	}
}
