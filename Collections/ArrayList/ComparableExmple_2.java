package collections.ArrayList;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	String name;
	int Id;
	Long salary;
	String company;

	public Employee(String name, int id, Long salary, String company) {

		this.name = name;
		Id = id;
		this.salary = salary;
		this.company = company;
	}

	public String toString() {
		return Id + ", " + name + ", " + salary + ", " + company + "\n";
	}

//	@Override
//	public int compareTo(Employee o) {
//		return o.Id - Id;
//	}	
//	

	// If we wanted to sort by Names in the list
	@Override
	public int compareTo(Employee o) {

		return name.compareTo(o.name);
	}

}

public class ComparableExmple_2 {

	public static void main(String[] args) {

		TreeSet<Employee> e1 = new TreeSet<>();
		e1.add(new Employee("SHIVA", 1049, 20000l, "it Solutions"));
		e1.add(new Employee("Vishnu", 1046, 20000l, "Havi solutions"));
		e1.add(new Employee("Rohan", 1048, 25000l, "Rohan Solutions"));
		e1.add(new Employee("Anji", 1047, 19500l, "havi solutions"));

		// System.out.println(e1);

		for (Employee e : e1) {
			System.out.println(e);
		}

	}
}
