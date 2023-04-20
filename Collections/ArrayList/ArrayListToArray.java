
package collections.ArrayList;

import java.util.*;

public class ArrayListToArray {
	public static void main(String[] args) {

		
		ArrayList<Integer> arr = new ArrayList<>();
		

		for (int i = 1; i <= 20; i++) {
			arr.add(i);
		}
	
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		
		Object a[] = arr.toArray();
	
		for (Object i : a) {
			
			System.out.print(i + " ");
		}

		

		
		
		
		
	}
}
