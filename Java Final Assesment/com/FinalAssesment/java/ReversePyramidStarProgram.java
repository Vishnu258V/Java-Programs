package com.FinalAssesment.java;
/*
 	* * * * * *
 	  * * * *
 	  	* * 
 	  	 * 
 */

public class ReversePyramidStarProgram {
	public static void main(String[] args) {
		
	int row = 5;
		
		for(int i = row; i>= 0; i--) {
			
			for(int space = i; space <= row; space++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (i*2-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
