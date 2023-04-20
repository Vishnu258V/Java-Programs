package com.StringManipulation.Examples;

public class StringComaprision {

	public static void main(String[] args) {
	
		/*
		  The output is false for the first example and true for the second example. In
		  second example, parameter to equals() belongs String class, while in first
		  example it to StringBuffer class. When an object of String is passed, the
		  strings are compared. But when object of StringBuffer is passed references
		  are compared because StringBuffer does not override equals method of Object
		  class. For example, following first program prints false and second prints
		  true.
		  
		  =>  So we use contentEquals(); method

		  if you wanted to check the two strings [ stringBuffer (or) StringBuilder ] we need to convert 
		  Strings into  toString(); method then use equals()  method; 
		  
		  
		 */
		
		// Strings   --> Immutable
		String s1 = "Vishnu";
		String s7 = "Vishnu";
		String s2 = "Kumar";
		
		// String with new Keyword  --> Immutable
		String s3 = new String("Vishnu");
		String s4 = new String("Kumar");
		String s5 = new String("Vishnu");
		
		
		// StingBuffer  --> Mutable 
		StringBuffer sb1 = new StringBuffer("Vishnu");
		StringBuffer sb2 = new StringBuffer("Kumar");
		StringBuffer sb3 = new StringBuffer("Vishnu");
		
		
		// StringBuilder  --> Mutable  
		StringBuilder sbl1 = new StringBuilder("Vishnu");
		StringBuilder sbl2 = new StringBuilder("Kumar");
		StringBuilder sbl3 = new StringBuilder("Vishnu");
		
		
		// Checking 
		System.out.println(s1.equals(sb1));
		System.out.println(s1.equals(s7));
	    System.out.println(sb1.toString().equals(s1));
		System.out.println(s1.contentEquals(sbl1));
		
	}
}
