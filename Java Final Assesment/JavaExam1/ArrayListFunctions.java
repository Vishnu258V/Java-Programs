package JavaExam1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFunctions {
	public static void main(String []args){
		
		System.out.println("Enter the Size of the Arraylist (n) : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		// to add Each value into the arraylist
		
		while(n > 0 ) {
		int element = sc.nextInt();
		arrList.add(element);
		n--;
		}
		// to replace index 4 value to index 8 value
		 arrList.add(4, arrList.get(8));
		// to remove n value at index 2
		arrList.remove(2);
		// to print the values present in the ArrayList
		for(int i : arrList) {
		System.out.println(i);
		}
		// to get the size
		System.out.println(arrList.size());
		// if the value present it will print TRUE otherwise it will print FALSE
		System.out.println(arrList.contains(n));
		
		
 }
}