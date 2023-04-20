package Assignment_1BasicProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

// Write a java program to find second largest number in an array of numbers..

public class SecondlargestArray {

	public static void main(String[] args) {

		List<Integer> lis = new ArrayList<Integer>();

		System.out.println("Enter the size of the arrayList ");
		Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();

		System.out.println("\nEnter the Numbers to to add into array ");
		for (int i = 1; i <= size; i++) {
			int num = sc.nextInt();

			lis.add(num);
		}

		// Sorting the elements in the array
		Collections.sort(lis);

		ListIterator<Integer> itr = lis.listIterator(lis.size());

//      Traversing the sorted elements in the original order
//		while (itr.hasNext()) {
//			itr.next();
//		}

		// Traversing the sorted elements in the reverse order
		List<Integer> list2 = new ArrayList<>();
		
		while (itr.hasPrevious()) {
			list2.add(itr.previous());
		}
		System.out.println(list2);
		System.out.println("\n" + list2.get(1) + " is the 2nd largest number in the given array ");

	}
}
