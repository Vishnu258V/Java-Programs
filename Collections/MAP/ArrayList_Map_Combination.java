package com.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayList_Map_Combination {

	public static void main(String[] args) {
		
		
		ArrayList<String> sub  = new ArrayList<>();
		ArrayList<Character> grade= new ArrayList<>();
		
		sub.add("english");
		sub.add("maths");
		sub.add("sciences");
		sub.add("social");
		
		grade.add('A');
		grade.add('B');
		grade.add('A');
		grade.add('D');

		
		HashMap<List<String>, List<Character>> marks = new HashMap<>();
		marks.put(sub, grade);
		
		for(List<String> s : marks.keySet()) {
			
			for(String i : s) {
				System.out.println(i);
			}
		}
		
		
		
		
	}

}
