package Date_20_12_2022;

import java.util.Map.Entry;

class Student {
	int age;
	String name;
	int rollNum;
	String course;

	public Student(int age, String name, int rollNum, String course) {
		this.age = age;
		this.name = name;
		this.rollNum = rollNum;
		this.course = course;
	}

	public void Eligibility() {
		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z') {

				count++;
			}
		}

		// For Age Checking
		try {

			if (age < 18) {
				throw new Exception("Student is Under Age to Join in this Course ");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// For UserName Checking
		try {

			if (count != 0) {
				throw new Exception("Name Should not contain Special Characters ");
			}

		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

		System.out.println(
				"\nStudent name  = " + name + "\nRoll no = " + rollNum + "\nAge    = " + age + "\nCource  = " + course);
	}

}

public class StudentRecord {
	public static void main(String[] args) throws Exception {

		// without Exception
		Student s1 = new Student(22, "Vishnu", 342, "Btech");
		s1.Eligibility();
		
		// with Under age Exception
		Student s2 = new Student(16, "kumar", 228, "Mtech");
		s2.Eligibility();

		// with improper user name exception
		Student s3 = new Student(23, "Anji@123", 345, "MCA");
		s3.Eligibility();

		// with both improper user name and under age exception
		Student s4 = new Student(15, "Rohan@123", 120, "Doctor");
		s4.Eligibility();

	}

}
