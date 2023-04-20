package Arrays_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_3 {

	public static void main(String[] args) {
	
		int []a = {10,20,30,54,96,78,36,46};
		
		ArrayList<Integer> list = new ArrayList<>();

		for(int b : a) {
			System.out.print(b+" ");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	       List<int[]>	lis = Arrays.asList(a);
		
		
	       for(int[] i : lis) {
	    	   System.out.println(i);
	       }
		
		
		
		
		
	}

}
	