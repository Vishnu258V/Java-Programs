package assignments_TrainingClassess;
/*
 
 
 * 
 * *
 * * *
 * * * *
 * * * * *
   
 
 */


 public class PrintStarPattern_1{
    public static void main(String[] args) {
   
    		int rows = 5;
    	 
    		for(int row=1; row<=rows; row++) {
    			
    			for(int col=1; col<=row; col++) {
        			System.out.print("* ");
    			}
    					System.out.println();
    		}	
    }
}