package com.StringManipulation.Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//public class String_1 {
//	public static void main(String[] args) {

//		// whenever we declare a String with the Double quotes it will store in a

//		// String constant pool memory location
//		String s1 = "Vishnu,Kumara,Swami  ";
//		String s2 = "Vishnu";
//
//		// System.out.println((s1==s2)+ "\n"+(s2==s3));
//		String s4 = s1.replace(',', ' ');
//		// System.out.println(s4);
//
//		// with new keyword it will store in a Heap Memory
//		StringBuffer s3 = new StringBuffer("VishnuKumaraSwami");
//
//		// By using the Insert() method in StringBuffer class we can insert
//		// the elements at Specified index
//		s3.insert(6, ' ');
//		s3.insert(13, ' ');
//		// System.out.println(s3);
//
//		String s = s2.substring(0, 3);
//		String temp = "";
//
//		for (int i = 1; i <= 3; i++) {
//			temp = temp + s;
//		}
//		System.out.println(temp);
//
//		Integer i = Integer.parseInt("789");
//		System.out.println(i);

//	}
//}

class Employee {
	private int empId;
	private String empName;
	private String designation;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

}

class ResourceClass {

	Scanner sc = new Scanner(System.in);
	Map<Integer, Employee> map = new HashMap();

	public void enterDetails() {

		Employee e1 = new Employee();
		System.out.println("Enter your all details");
		try {
			System.out.println("Enter Employee Id(positive Integer Number)");
			int empId = sc.nextInt();
			if (empId > 0) {
				e1.setEmpId(empId);

			} else {
				System.out.println("Don't Enter the negetive values");
				// System.exit(0);
				return;
			}
			System.out.println("Enter Emplopyee  Name");
			String empName = sc.next();
			e1.setEmpName(empName);
			System.out.println("Enter Employee designation");
			String designation = sc.next();
			e1.setDesignation(designation);
			System.out.println("Enter Employee salary(Positive Decimal Value)");
			double salary = sc.nextDouble();
			if (salary > 0) {
				e1.setSalary(salary);
			} else {
				System.out.println("Please enter Positive inputs ");
			}
		} catch (Exception e) {
			System.out.println("Please enter correct input ");
		}
		map.put(e1.getEmpId(), e1);
	}

	public void getIndividualDetails() {

		ArrayList<Integer> al = new ArrayList(map.keySet());
		System.out.println("Enter Your Individual (Integer range)Id for Getting Your Idvidual result");
		try {
			int id = sc.nextInt();
			if (id > 0) {
				for (int i = 0; i < al.size(); i++) {
					if (al.get(i) == id) {
						System.out.println(map.get(al.get(i)));
					} else {
						System.out.println("No recods are found for your Entered Id");
					}
				}
			} else {
				System.out.println("Enter Postive Integer Number");
			}
		} catch (Exception e) {
			System.out.println("Enter input is not matching please enter the correct input");
		}

	}

	public void getAllDetails() {
		System.out.println("All The Employee  Details");
		for (int i : map.keySet()) {
			System.out.println(map.get(i));

		}
	}

}

public class String_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ResourceClass rs = new ResourceClass();

		while (true) {

			System.out.println(
					"\n                                  Hi Students fill your details                           \n");
			System.out.println(
					"1:For Insert  your details\n   2: For Enter the unique Id to get your Unique Details \n 3:For To get the all the Employee Details\n ");
			System.out.println("Please select Above any one Option as Your choice ");
			try {
				int choice = sc.nextInt();
				if (choice > 0) {
					switch (choice) {
					case 1:
						rs.enterDetails();
						break;

					case 2:
						rs.getIndividualDetails();
						break;

					case 3:
						rs.getAllDetails();
						break;

					default:
						System.exit(0);
					}
				} else {
					System.out.println("Don't Enter negative input");
				}
			} catch (Exception e) {
				System.out.println("Your Entered input is notmatching please Enter Correct Input");
			}
			System.out.println("-------------------------------------------------------");
		}

	}
}
