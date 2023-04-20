package collections.ArrayList;

import java.util.ArrayList;

public class ReverseAdding {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(6); // Display the arraylist values in the reverse order.
        ArrayList<Integer> arr1 = new ArrayList<Integer>(6);
        arr.add(40);
        arr.add(50);
        arr.add(110);
        arr.add(16);
        arr.add(85);
        arr.add(69);
       // System.out.println("Before Reverse :" + arr);
        

      for(int i = arr.size()-1; i >= 0; i--) {
    	  arr1.add(arr.get(i));
      }
        System.out.println(arr1);
        
        
        
        
        
        
        
    }
	
}

