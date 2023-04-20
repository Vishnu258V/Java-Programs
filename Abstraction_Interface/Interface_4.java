
package Abstraction_Interface;

interface superclass1 {
	
	public abstract void show ();
	public abstract void display ();
	public abstract void play();
	
	// i am just giving default keyword to methods which we can override in sub classes
	public default void defaultMethod1 () {
		System.out.println("HI");
	}
	default void defaultMethod2() {}
	
	
	// i am also giving static keyword to methods which we can't override
	public static void staticMethod1 () {
		System.out.println("Hello");
	}
	static void staticMethod2 () {}
	
	
}
class subclass1 implements superclass1 {

	// here we have to implement the all unimplemented methods which are declared in superclass1

	@Override
	public void show() {
	}

	@Override
	public void display() {
	}

	@Override
	public void play() {
	}
	// here NO NEED to implement the methods which are declared as default & static
		
}

class subclass2 extends subclass1 {
	
	
	// We can Override the default methods declared in the interface class
	@Override
	public void defaultMethod1() {
	}
	
	@Override
	public void defaultMethod2() {
	}
	
	
//		// here we can't override the static methods declared in interface class
//			@Override
//			public void staticMethod1() {
//			}
//			
//			// it is normal method
//			public void staticMethod2() {
//			}
//	
}


public class Interface_4 {
	public static void main(String[] args) {

		//We can directly call the methods which are declared as Static
		superclass1.staticMethod1();
		
		//We can't directly call the methods which are declared as default
		//superclass1.defaultMethod1();
		
		
	}
}
