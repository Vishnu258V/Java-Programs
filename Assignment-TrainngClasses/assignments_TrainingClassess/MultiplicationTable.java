package assignments_TrainingClassess;
import java.util.*;

// Multiplication Table 
public class MultiplicationTable {
	public static void main(String[] args) {
		
		System.out.print("Enter the table number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for (int i = 0; i <= 12; i++) {

			System.out.println(num + " * " + i + " = " + (num * i));
		}
		

		
	
		
			
	}

}
