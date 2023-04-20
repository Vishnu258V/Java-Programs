package FinalAssesmentModifications;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListInAscendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the ArrayList  to add the elements into the List "
				+ "\nto print the list assending order  : ");

		int size;
		try {
			size = sc.nextInt();
		} catch (Exception e) {
			throw new InputMismatchException("Please enter the Size of the ArrayList in Integer Values only");
		}

		System.out.println("\nEnter the elements into ArrayList one by one : ");
//		ArrayList<Integer> integerValues = new ArrayList<>();
		ArrayList<String> stringValues = new ArrayList<>();
//		ArrayList<Character> charValues = new ArrayList<>();

		while (size > 0) {
			String value = sc.next();
			stringValues.add(value);
			size--;
		}

		// ArrayList in Ascending order
		System.out.println("\nArrayList in Assending order : ");
		Collections.sort(stringValues);
		for (String i : stringValues) {
			System.out.println(i);
		}

		// ArrayList in descending order
		System.out.println("\nArrayList in Descending order : ");
		Collections.reverse(stringValues);
		for (String i : stringValues) {
			System.out.println(i);
		}

	}
}
