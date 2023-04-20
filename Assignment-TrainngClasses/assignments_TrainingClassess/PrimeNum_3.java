package assignments_TrainingClassess;
import java.util.*;

// Printing the Prime Numbers from 1 to given number, by using Scanner

public class PrimeNum_3 {

	public static void main(String[] args) {

		System.out.println("Enter the number to print Prime Numbers up to N that numbers ");
		
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer count = 0;
			for(int j=2;j<=n;j++){
	         count=0;
	         
	         for(int i=1;i<=j;i++){
	            if(j%i==0){
	               count++;
	            }
	         }
	         if(count==2)
	         System.out.print(j+" ");
	      }	

	
	}	
}


