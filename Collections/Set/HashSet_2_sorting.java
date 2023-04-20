package com.Set.Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_2_sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set1 = new HashSet<>();
		
		System.out.println("Enter the No of elements that going to store ");
		int NoOfElements = sc.nextInt();
		
		System.out.println("Enter the elements to store in HashSet ");
		for(int i = 1; i <= NoOfElements; i++) {
			
			int num = sc.nextInt();
			set1.add(num);
		}
		
		System.out.println(set1);

		// The Collections sort method is used to sort the elements
		List<Integer> list = new ArrayList<>(set1);
		Collections.sort(list);
		System.out.println(list);
		
		
		// It is Also used for sorting the elements
		Set<Integer> tr = new TreeSet<>(set1);
		System.out.println(tr);
		
		
	}

}
