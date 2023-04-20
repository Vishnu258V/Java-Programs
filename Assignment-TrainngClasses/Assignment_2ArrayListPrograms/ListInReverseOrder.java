package Assignment_2ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//	Display the Arraylist values in the reverse order.
public class ListInReverseOrder {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		
		
		System.out.println("ArrayList Values in Original Insertion Order : ");
		for(int i : list) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n\nArrayList values in Reverse Order : ");
		ListIterator<Integer> itr = list.listIterator(list.size()); // adding the size of the arraylist to listiterator
		
//		while(itr.hasNext()) {
//			itr.next();
//		}
		
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
		
		
		
		
		
	}
}
