package assignments_TrainingClassess;
import java.util.*;
/*
  Armstrong number definition is the number in any given number base, 
  which forms the total of the same number, when each of its digits is raised to the power of the number of digits in the number.
  
    For 153, the operation is 1^3 5^3 3^3=153

 	For 370 the operation is 3^3 7^3 0^3=370

 	For 371 the operation is 3^3 7^3 1^3=371
 */
public class AmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number to check Amstrong Number : ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int remain = 0;
		int count = 0;
		int sum =0;
		int temp = number;
		int temp2 = number;
		while(number != 0) {
			
			number = number/10;
			count++;	
		}
		
		while(temp != 0) {
			
			remain = temp%10;
			temp = temp/10;
			
			sum = sum + (int) Math.pow(remain, count);
		}
		
		
		if(sum == temp2) {
			System.out.println(temp2+ " is An Amstrong Number");
		}else {
			System.out.println(temp2+ " is Not An Amstrong Number");
		}
		
	}

}
