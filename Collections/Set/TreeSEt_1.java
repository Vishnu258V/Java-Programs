package com.Set.Examples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSEt_1 {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> tr1 = new TreeSet<>();
		
	//  tr1.add(null);		

	//	tr1.add(null);	
		tr1.add(45);
		tr1.add(20);
		tr1.add(null);
		tr1.add(78);      
		tr1.add(null);                     
		tr1.add(82);  
		tr1.add(10);
		tr1.add(30);
		
		Iterator<Integer> it1 = tr1.iterator();
		
		while (it1.hasNext()) {

			Integer a = it1.next();
			System.out.println(a);
		}
	
		
		
	}

}
