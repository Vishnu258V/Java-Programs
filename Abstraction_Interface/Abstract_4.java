package Abstraction_Interface;


abstract class ABstract {
	
	static String name ;
	
	
	public ABstract(String name) {
		
		this.name = name;
	}
	
	public abstract void show();
		abstract void test2();
		
		// We can't write the abstract method like this without declaring the abstract keyword
		void test3();// It will consider as a non abstract method, we have to provide method body
	
}

class Subclass3 extends ABstract {
	
	String lastName ;
	
	public Subclass3(String lastName) {
		super("Vishnu"); // Look at this carefully by comparing the super class constructor and subclass
					// here we can give super class variables names also if give them as parameters in Constructor
		this.lastName = lastName;
	}
	
	@Override
	public void show() {	
		System.out.println("Name : "+super.name + "\nLast name : "+this.lastName);	
	}

	@Override
	void test2() {
	}	
}

 public class Abstract_4 {
	public static void main(String[] args) {
		
		Subclass3 s1 = new Subclass3("Kumara swami");
		s1.show();
		
	
	}
}
