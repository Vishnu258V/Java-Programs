package collections.ArrayList;

import java.util.ArrayList;
import java.util.TreeSet;

class student {
	String firstName;
	String lastName;
	String collegename;
	int rollNum;
	int phNumber;
	int age;

	public student(String firstName, String lastName, String collegename, int rollNum, int phNumber, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.collegename = collegename;
		this.rollNum = rollNum;
		this.phNumber = phNumber;
		this.age = age;
	}

	public String toString() {
		return "\n\nFirst Name : = " + firstName + "\nLast Name : = " + lastName + "\nRoll Number : = " + rollNum
				+ "\nPhone num : = " + phNumber + "\nAge       : = " + age+"\nCollege Name : "+collegename;
	}
}

public class ComparableExmpl_1 {
	public static void main(String[] args) {
		
		ArrayList<student> s2 = new ArrayList<>();
		s2.add(new student("Vishnu","V","BitsVizag",342,912345,23));
		s2.add(new student("Anji","A","Jntuk",340,812345,27));
		s2.add(new student("kavya","K","Gitam",341,612345,23));
		s2.add(new student("rohan","R","krishna ",342,78932,23));
		s2.add(new student("Shiva","S","Andhra University",342,512345,23));
		System.out.println(s2);// No error
		
		TreeSet<student> s1 = new TreeSet<>();
		s1.add(new student("Vishnu","V","BitsVizag",342,912345,23));
		s1.add(new student("Anji","A","Jntuk",340,812345,27));
		s1.add(new student("kavya","K","Gitam",341,612345,23));
		s1.add(new student("rohan","R","krishna ",342,78932,23));
		s1.add(new student("Shiva","S","Andhra University",342,512345,23));
		System.out.println(s1); // Error
		

		/*  This is what happen when we try to Objects in TreeSet();
		  ========================================================
		  
		 Exception in thread "main" java.lang.ClassCastException: class
		 collections.ArrayList.student cannot be cast to class java.lang.Comparable
		 (collections.ArrayList.student is in unnamed module of loader 'app';
		 java.lang.Comparable is in module java.base of loader 'bootstrap') at
		 java.base/java.util.TreeMap.compare(TreeMap.java:1569) at
		 java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776) at
		 java.base/java.util.TreeMap.put(TreeMap.java:785) at
		 java.base/java.util.TreeMap.put(TreeMap.java:534) at
		 java.base/java.util.TreeSet.add(TreeSet.java:255) at
		 collections.ArrayList.ComparableExmpl_1.main(ComparableExmpl_1.java:34)
		 */
		
		
	}
}
