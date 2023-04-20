package assignments_TrainingClassess;
/*
	*
   **
  ***
 ****
*****

*/

public class PrintStarPattern_3 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<= n-r; c++) {
				System.out.print(" ");
			}
			
			for(int i=1; i<= r; i++) {
				System.out.print("*");
			}
				
			System.out.println("");
		}
		
		
	}

}
