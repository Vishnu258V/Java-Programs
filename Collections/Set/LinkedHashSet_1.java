package com.Set.Examples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_1 {

	public static void main(String[] args) {
	
		
		LinkedHashSet<String> in1 = new LinkedHashSet<>();
		
		
		in1.add(null);		
		in1.add("Vishnu");
		in1.add("kumar");	
		in1.add("kumar");
		in1.add(null);	
		in1.add("kumar");
		in1.add(null);
		in1.add("Anji");      
		in1.add(null);                     
		in1.add("Rohan");      
		
		Iterator<String> it1 = in1.iterator();
		
		while( it1.hasNext()) {
			
			String a = it1.next();
			System.out.println(a);
		}

	}
}
