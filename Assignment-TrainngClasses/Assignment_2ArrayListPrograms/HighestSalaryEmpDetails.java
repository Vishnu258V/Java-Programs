package Assignment_2ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

// Display the highest salary employee details from the list of employees.

class Employee1 {

	private String name;
	private int empId;
	private String companyName;
	private long PhNo;
	private double salary;

	public Employee1(double salary, String name, int empId, String companyName, long phNo) {
		this.salary = salary;
		this.name = name;
		this.empId = empId;
		this.companyName = companyName;
		this.PhNo = phNo;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getPhNo() {
		return PhNo;
	}

	public double getSalary() {
		return salary;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setPhNo(long phNo) {
		PhNo = phNo;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee Name   -  " + getName() + "\nEmployee Id    -  " + getEmpId() + "\nCompnay Anme   -  "
				+ getCompanyName() + "\nContact Number -  " + getPhNo() + "\nSalary         -  " + getSalary();
	}

}

public class HighestSalaryEmpDetails {
	public static void main(String[] args) {

		List<Employee1> li = new ArrayList<Employee1>();

		Employee1 e1 = new Employee1(20000, "Vishnu", 1046, "Havi Solutions", 7893240720L);
		Employee1 e2 = new Employee1(22000, "Anji", 1047, "Havi Solutions", 999998888L);
		Employee1 e3 = new Employee1(19000, "Rohan", 1048, "Havi Solutions", 8899774455L);
		Employee1 e4 = new Employee1(21000, "Kavya", 1049, "Havi Solutions", 7788994455L);
		Employee1 e5 = new Employee1(20500, "Prathibha", 1050, "Havi Solutions", 8888877777L);

//		List<Double> salaries = new ArrayList<>();

		e1.setSalary(20000);
		e2.setSalary(22000);
		e3.setSalary(19000);
		e4.setSalary(21000);
		e5.setSalary(20500);
		double s1 = e1.getSalary();
		double s2 = e2.getSalary();
		double s3 = e3.getSalary();
		double s4 = e4.getSalary();
		double s5 = e5.getSalary();

		if (s1 > s2 && s1 > s3 && s1 > s4 && s1 > s5) {
			li.add(e1);

		} else if (s2 > s1 && s2 > s3 && s2 > s4 && s2 > s5) {
			li.add(e2);

		} else if (s3 > s1 && s3 > s2 && s3 > s4 && s3 > s5) {
			li.add(e3);

		} else if (s4 > s1 && s4 > s3 && s4 > s2 && s4 > s5) {
			li.add(e4);

		} else {
			li.add(e5);

		}

		for (Employee1 employee1 : li) {
			System.out.println(employee1);
		}

	}
}
