package com.LinkedList;
import java.util.*;

// Mostly linked lists are preferable for list manipulation , whereas arrayList is 
// mostly preferable for searching , retrieving 

public class LinkedList_1 {

	public static void main(String[] args) {
	
		
		List<Integer> list = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		
			for(int i =1; i<=30; i++) {
				list.add(i);
				
				if(i%5 == 0) {
					list2.add(i);
				}
			}
			
			System.out.println(list2);

	}

}
