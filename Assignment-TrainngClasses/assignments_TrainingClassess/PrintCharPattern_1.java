package assignments_TrainingClassess;

/*

A
A B
A B C
A B C D 
A B C D E 

unicode values of  A = 65;

*/

public class PrintCharPattern_1 {
	public static void main(String[] args) {
		
		 for(int i=1;i<=5;i++) {
	            System.out.print(" ");
	        
	            for(int j=1;j<=i;j++) {
	                
	            System.out.print("*");
	        }
	            System.out.println();
	        }
		
	}
}
