package Abstraction_Interface;



interface base1 {
	static int x = 20;
	
	void show();
	int add();

	default String name() {
		return null;
	}

	default void data() {

	}
}

//The type Admin must implement the inherited abstract methods from abstract class
//it will give compilation error

class subclass implements base1 {
	
	
	@Override
	public void show() {
		System.out.println("hellooo");
	}
	
	@Override
	public int add() {
		return 0;	
	}
	
}

public class Interface_1 {
	public static void main(String[] args) {

		subclass s1 = new subclass();
		s1.show();
		
		System.out.println(s1.x);
		
	}
}


