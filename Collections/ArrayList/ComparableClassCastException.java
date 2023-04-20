package collections.ArrayList;

import java.util.TreeSet;

class Emp implements Comparable<Emp> {
    int id;
    String firstName;
    String lastName;
    
    public Emp(int id,String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
	public String toString() {
		return " "+ firstName + ", "+lastName+" "+id;
	}

	@Override
	public int compareTo(Emp o) {

		if(id == o.id) {
			return 0;
		}else if(id > o.id) {
			return 1;
		}else {
			return -1;
		}
		
	}
    
}

public class ComparableClassCastException {
    public static void main(String[] args) {
      
    	TreeSet<Emp> treeSet = new TreeSet<>();
        treeSet.add(new Emp(112,"Anji","A"));
        treeSet.add(new Emp(456,"Rohan","B"));
        treeSet.add(new Emp(456,"Vishnu","C"));
        treeSet.add(new Emp(102,"Pratibha","D"));
      
        for (Emp emp : treeSet) {
			System.out.println(emp);
		}
        
        
    }
}

 