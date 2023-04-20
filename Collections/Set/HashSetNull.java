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


public class HashSetNull {
	public static void main(String[] args) {

		HashSet<String> h1 = new HashSet<>();
			
		
			h1.add("vishnu");		h1.add("vishnu");
			h1.add("kumar");		h1.add(null);
			h1.add(null);			h1.add("Anji");
			h1.add("kumar");
			h1.add("kumar");
			h1.add(null);
			h1.add("kumar");
			h1.add("Kavya");
			h1.add("Rohan");
		
		
	
			
			//System.out.println(h1.clone());
			
			// h1.clear();
			
			for (String s : h1) {
				System.out.println(s);
			}
		

			
			
			
	}
}
