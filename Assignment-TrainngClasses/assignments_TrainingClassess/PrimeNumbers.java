package assignments_TrainingClassess;
import java.util.*;


public class PrimeNumbers {

	public static void main(String[] args) {
		
		// Number to be Checked
		int num = 13;
		
		// Count is the variable used to check the factors that the Number have
		int count = 0;
		
		for(int i = 1; i<=num; i++) {
			
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + " Is a Prime Number ");
		}else {
			System.out.println(num+ " Is not a Prime Number");
		}
		
	
		
	}    	
}


