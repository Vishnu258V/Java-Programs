
package Abstraction_Interface;
import java.util.*;

interface pulser  {
	
	void changeGear();
}

abstract class Bike implements pulser {
	
	// Constructor
	public Bike() {
		System.out.println("Bike created");
	}

	
	abstract void run();

	public void changeGear() {
		System.out.println("Gear changed");
	}
}


//Creating a Child class inherits Abstract class
class Honda extends Bike {
	
	@Override
	public void run() {
		System.out.println("Bike is running safely...");
	}
}



//Creating a main class which calls abstract and non-abstract methods
class Abstract_1 {
	public static void main(String args[]) {
		
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	
	
	}
}
