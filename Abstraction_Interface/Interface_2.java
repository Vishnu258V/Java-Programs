package Abstraction_Interface;
	
	interface demo{
		
		// Static method
		static void fist() {
			System.out.println("This is static method ");
		}
		
			
		// Default methods
		default void scnd() {
			System.out.println("This is Default Method-1\n");
		}
		
		default void thrd() {
			System.out.println("This is Default Method-2\n");
		}
		
		
		// Abstract method
		abstract void frth();    
	}
	
	   // Subclass 
class demo2 implements demo {
	
	
			@Override
			public void scnd() {
				System.out.println("Default method from the Sub class\n ");	
			}

			@Override
			public void frth() {
				System.out.println("This is Overridden method from interface \n");
			}	
}
 
	// Main Method
	public class Interface_2 {
		public static void main(String[] args) {
			
			// Object for subclass(demo2)
			demo2 dm = new demo2();
			dm.frth();   // Override method calling
			
			
			dm.scnd(); 
			
			dm.thrd();  
			/* Default method should be call with the sub class object 
            reference name here (dm)  is reference name for the object 8\*/
			
			
			demo.fist();  // static method directly call with class name
				
		}
		
	}
