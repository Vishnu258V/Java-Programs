package Assignment_2ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Program to remove the Duplicates if any in the Given ArrayList
public class RemoveDuplicates_2 {

	public static void main(String[] args) {

		System.out.println("Enter the Size of the ArrayList to insert the Elements : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		List<String> li = new ArrayList<String>();
		List<String> dupl = new ArrayList<String>();
		/*
		 * li.add(10); li.add(20); li.add(30); li.add(10); li.add(20); li.add(30);
		 * li.add(40); li.add(10); li.add(50);
		 */
		System.out.println("Enter the numbers to insert into the ArrayList : ");
		while (size >= 0) {

			String num = sc.nextLine();

			li.add(num);
			size--;
		}

		for (int i = 0; i < li.size(); i++) {
			for (int j = 0; j < li.size(); j++) {
				if (dupl.contains(li.get(j))) {

				} else {
					dupl.add(li.get(j));
				}
			}
		}

		System.out.println("After removing the Duplicates : ");
		for (String i : dupl) {
			System.out.println(i);
		}

	}

}
