package assignments_TrainingClassess;
import java.util.*;


public class PrimeFrom_N2N {

	public static void main(String[] args) {

		System.out.println("Enter the numbers to Print Prime Numbers from (N  to  N)  number");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the First Number ");
		int firstNum = sc.nextInt();
		System.out.println("Enter the Last Number ");
		int lastNum = sc.nextInt();
		int factors = 0;
		
		
		for(int i = firstNum; i<=lastNum; i++) {
			factors = 0;
			
			for(int j = 1; j<=i; j++) {
				
				if(i%j == 0) {
					factors++;
				}
				
			}
			
			if(factors == 2) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
