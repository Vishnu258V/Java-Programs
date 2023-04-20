package com.StringManipulation.Examples;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class show {
}

final class demo extends show {
}

public class String_2 {
	public static void main(String[] args) throws IOException {

//		StringBuffer s1 = new StringBuffer("Completa");
//		s1.setCharAt(1, 'i');
//		s1.setCharAt(7, 'd');
//		System.out.println(s1);
//
//		// Creating FileInputStream object
//		File file = new File("D:/myFile.txt");
//		FileInputStream fis = new FileInputStream(file);
//		byte bytes[] = new byte[(int) file.length()];
//		// Reading data from the file
//		fis.read(bytes);
//		// Writing data to another file
//		File out = new File("D:/CopyOfmyFile.txt");
//		FileOutputStream outputStream = new FileOutputStream(out);
//		// Writing data to the file
//		outputStream.write(bytes);
//		outputStream.flush();
//		System.out.println("Data successfully written in the specified file");

		String a = "Hi";
		String b = "Hi";
		String c = new String("Hi");
		String d = new String("Hi");

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(d.equals(c));

//		Queue<Integer> que = new PriorityQueue<>();
//		
//		int i = que.poll();
//		String s = String.valueOf(i);
//		System.out.println(s);
//		que.peek();

		// TODO code application logic here
		Scanner sc = new Scanner(System.in);
		int dane = 0;

		boolean keepLooping = true; // if you delete this works the same with same problem
		while (keepLooping && dane >= 0) {

			System.out.println("Pick a number:");
			try {

				dane = Integer.parseInt(sc.next());

				break;
			} catch (NumberFormatException e) {
				keepLooping = true;
			}
			System.out.println("Out from exception");

		}
		
		
		
		
		
		
		
		
		
	}

}
