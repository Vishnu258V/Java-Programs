package collections.ArrayList;

import java.util.*;

public class AddElementsToArrayList {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Vishnu");
		names.add("Anji");
		names.add("Rohan");
		names.add("Kumar");
		System.out.println("names : \n ");

		for (String list : names) {
			System.out.println(list);
		}

		ArrayList<Integer> num = new ArrayList<>();
		num.add(251);
		num.add(231);
		num.add(101);
		num.add(999);
		num.add(211);
		num.add(25);

		System.out.println(Collections.max(num));
		Iterator<Integer> itr = num.iterator();

		System.out.println("\nPrinting the numbers : \n ");
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i.equals(251) ) {
				itr.remove();
			}
		}
		System.out.println(num);
		
//		int count = 0;
//		System.out.println();
//		for (list a : num) {
//
//			if (a == 25) {
//				num.remove(count);
//				
//			}
//
//			System.out.println(a);
//			count++;
//		}

	}

}
