
//  Write a Java program to create a new array list, 
//  add some colors (string) and print out the collection


package collections.ArrayList;

import java.util.*;

public class RetrieveArrayList_3 {

	public static void main(String[] args) {
		
		ArrayList<String> colours = new ArrayList<>();
		
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Purple");
		colours.add("Green");
		colours.add("Voilet");
	
		System.out.println("Printing the List_1  :\n \nBefore Sorting\n----------");
		
		for(String s : colours) {
			System.out.println(s);
		}
		
		ArrayList<String> clr = new ArrayList<>();
		
		clr.add("Red");
		clr.add("Green");
		clr.add("Voilet");
		clr.add("Yellow");
		clr.add("Purple");
		
		Collections.sort(clr);
		
		ListIterator<String> lis = clr.listIterator();
		System.out.println("\nPrinting the List_2  :\n \nAfter sorting\n----------");
		
		while(lis.hasNext()) {
			System.out.println(lis.next());
		}
		
			System.out.println("\n"+colours.containsAll(clr));
	}

}
