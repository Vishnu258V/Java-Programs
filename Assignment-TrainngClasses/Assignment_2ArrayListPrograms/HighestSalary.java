package Assignment_2ArrayListPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Display the highest salary employee details from the list of employees.
class Employee {

	private String name;
	private int empId;
	private String companyName;
	private long PhNo;
	private double salary;

	public Employee(double salary, String name, int empId, String companyName, long phNo) {
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
		return "\nEmployee Name   -  " + getName() + 
				"\nEmployee Id    -  " + getEmpId() + 
				"\nCompnay Anme   -  "+ getCompanyName() + 
				"\nContact Number -  " + getPhNo() + 
				"\nSalary         -  " + getSalary();
	}

}

public class HighestSalary {
	public static void main(String[] args) {

		List<Employee> li = new ArrayList<Employee>();
		Employee e1 = new Employee(20000, "Vishnu", 1046, "Havi Solutions", 7893240720L);
		Employee e2 = new Employee(22000, "Anji", 1047, "Havi Solutions", 999998888L);
		Employee e3 = new Employee(19000, "Rohan", 1048, "Havi Solutions", 8899774455L);
		Employee e4 = new Employee(21000, "Kavya", 1049, "Havi Solutions", 7788994455L);
		Employee e5 = new Employee(20500, "Prathibha", 1050, "Havi Solutions", 8888877777L);
		
		li.add(e5);
		li.add(e4);
		li.add(e3);
		li.add(e2);
		li.add(e1);
		
		// If we want to sort the Objects by Specific elements we will use Comparator
		Comparator<Employee> cmp = Comparator.comparing(Employee :: getSalary);
		Collections.sort(li, cmp);
		
//		for(Employee e : li) {
//			System.out.println(e);
//		}
//		
		System.out.println("Highest salary Employee details are :\n"+li.get(li.size()-1));
		
	}
}
