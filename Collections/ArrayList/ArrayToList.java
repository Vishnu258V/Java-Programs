package collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToList {

	public static void main(String[] args) {

		System.out.println("Enter the array size ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i <= size - 1; i++) {
			arr[i] = i;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

		ArrayList<Integer> al = new ArrayList<>();
		for (int i : arr) {
			al.add(i);
		}

		al.add(25);
		al.add(35);
		System.out.println("\n" + al);

	}

}
