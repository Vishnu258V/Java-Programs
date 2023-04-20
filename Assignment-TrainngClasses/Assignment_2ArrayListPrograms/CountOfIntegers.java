package Assignment_2ArrayListPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountOfIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of the List  : ");
		int size = sc.nextInt();
		int temp = 0;
		
		List<Integer> lis = new ArrayList<>();
		Map<Integer, Integer> m1 = new HashMap<>();
	
		System.out.println("\nEnter the elements to insert into the list : ");
		while(size > 0) {
			int num = sc.nextInt();
			lis.add(num);
			size--;
		}
		
		for(int i = 0; i < lis.size(); i++) {
			int count = 0;
			for(int j = 0; j < lis.size(); j++) {
				
				if(lis.get(i).equals(lis.get(j))) {
					count++;	
				}
			}	
			m1.put(lis.get(i), count);
		}
		
		for(Integer i : m1.keySet()) {
			
			System.out.println(i+ " = "+m1.get(i) + " Times");
		}
		
		
		 
		
		
		
	}

}
