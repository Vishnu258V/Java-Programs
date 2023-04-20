package assignments_TrainingClassess;

import java.util.Iterator;

/*
 
 * * * *
 * * *
 * *
 * 
  
 */

public class PrintStarPattern_2 {
	
	public static void main(String[] args) {
		int n = 5;
		
		for (int r = 0; r < n; r++) {
			
			for(int c=0; c< n-r; c++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
