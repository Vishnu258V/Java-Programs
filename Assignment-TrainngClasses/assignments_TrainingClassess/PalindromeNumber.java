package assignments_TrainingClassess;
import java.util.*;

// Palindrome  Number for ex:- 121
//                  output :-  121

public class PalindromeNumber {

	public static void main(String[] args) {
	
		System.out.println("Enter the number to check Order : ");
		
	Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int newNum =0;
		int temp = num;
		while(num > 0) {
			
			int rem = num%10;
			num = num/10;
			
			newNum = newNum*10 + rem; 
		}
		System.out.println(newNum);
		
			if(temp == newNum) {
				System.out.println("It is a Palindrome Number ");
			}else {
				System.out.println("It is Not a Palindrome Number ");
			}
	
			
	}
}