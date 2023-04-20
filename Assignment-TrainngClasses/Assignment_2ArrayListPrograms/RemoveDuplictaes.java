package Assignment_2ArrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplictaes {
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		List<Integer> dupl =new  ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(10);
		li.add(50);
		//System.out.println(li);
		
		for (Integer i : li) {
			
			if(!dupl.contains(i)) {
				dupl.add(i);
			}
		}
		System.out.println(dupl);
		
	}
}
