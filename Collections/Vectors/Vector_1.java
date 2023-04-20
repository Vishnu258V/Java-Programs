package com.Vectors;
import java.util.Vector;

public class Vector_1 {
	public static void main(String[] args) {
		
		
		Vector<Integer> vl = new Vector<>(30 );
		
			for (int i = 1; i <= 70; i++) {
				vl.addElement(i);
			}
		
		System.out.println(vl.capacity());
	}
}
