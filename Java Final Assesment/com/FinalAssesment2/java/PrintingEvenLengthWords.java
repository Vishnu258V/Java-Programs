package com.FinalAssesment2.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintingEvenLengthWords {
	public static void main(String[] args) {

		System.out.println("Enter the String atleast two words to print even length words : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] arr = s.split(" ");

		List<String> list = Arrays.asList(arr);

		ArrayList<String> arrList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).length() % 2 == 0) {
				arrList.add(list.get(i));
			}

		}
		ArrayList<String> arrList2 = new ArrayList<>();
		for (int i = 0; i < arrList.size(); i++) {

			if (!(arrList.get(i).equals(""))) {
				arrList2.add(arrList.get(i));
			}
		}

		System.out.println("\nThese are the Words with Even Length in a String : ");
		for (String str : arrList2) {
			System.out.println(str);
		}

	}
}
