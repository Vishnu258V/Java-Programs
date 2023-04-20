package com.Set.Examples;
import java.util.*;

/*
1) boolean add(E e) 
2) void clear() 
3) object clone() 
4) boolean contains(Object o) 
5) boolean isEmpty() 
6) Iterator<E> iterator() 
7) boolean remove(Object o) 
8) int size() 
9) Spliterator<E> spliterator()
*/



// Set interface eliminates the duplicates from the elements
public class HashSet_1 {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<>();

		for (int i = 20; i <= 35; i++) {

			s1.add(i);
		}
	
		for (int i = 20; i <= 40; i++) {
			s1.add(i);
		}

		System.out.println(s1);
	
		
	}	
}
