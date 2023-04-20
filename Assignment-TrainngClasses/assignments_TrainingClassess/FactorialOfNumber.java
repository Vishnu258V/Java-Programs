package assignments_TrainingClassess;
import java.util.*;
/*
     	for ex:- factorial of 4 = 24;	
 =>		1 * 2 * 3 * 4 = 24
 
 */



public class FactorialOfNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter the Number to check Factorial :");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long fact = 1;
		for(int i=1; i<=num; ++i) {
			
			fact = fact*i;
		}
		
		System.out.println(fact);
		
	}

}
