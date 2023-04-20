package collections.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Employee11{
	public String name;
	int Id;
	Long salary;
	String company;

	public Employee11(String name, int id, Long salary, String company) {
		this.name = name;
		Id = id;
		this.salary = salary;
		this.company = company;
	}

}

class SortById implements Comparator<Employee11> {

	@Override
	public int compare(Employee11 o1, Employee11 o2) {
		
		if (o1.Id > o2.Id) {
			return 1;
		} else if (o1.Id < o2.Id) {
			return -1;
		} else {
			return 0;
		}
	}

class SortBYName implements Comparator<Employee11> {
       
	@Override
	public int compare(Employee11 o1, Employee11 o2) {
		return o1.name.compareTo(o2.name);
	}
}

 public static class Comparator_1 {
	public static void main(String[] args) {
		
		SortById s1 = new SortById();
		ArrayList<Employee11> e1 = new ArrayList<>();
		e1.add(new Employee11("SHIVA", 101, 20000l, "it Solutions"));
		e1.add(new Employee11("Vishnu", 102, 20000l,"Havi solutions"));
		e1.add(new Employee11("Rohan", 104, 25000l, "Rohan Solutions"));
		e1.add(new Employee11("Anji", 109, 19500l, "havi solutions"));
		//System.out.println(e1);
		Collections.sort(e1, new SortById());
		for(Employee11 e : e1) {
			System.out.println(e.Id);
		}
		
		
	}
 }
}


