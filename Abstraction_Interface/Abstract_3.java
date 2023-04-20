package Abstraction_Interface;

abstract class Havi {

	abstract void employeeDetails1();
	abstract void employeeDetails2();
	abstract void employeeDetails3();
	abstract void employeeDetails4();


}


// The type Admin must implement the inherited abstract methods from abstract class
// it will give compilation error
class Admin extends Havi {

	@Override
	void employeeDetails1() {
		System.out.println("Emp1 executed ");
	}

	public void employeeDetails2() {
		System.out.println(" was executed");
	}

	@Override
	void employeeDetails3() {
		// TODO Auto-generated method stub
	}

	@Override
	void employeeDetails4() {
		// TODO Auto-generated method stub
	}

}


// No need to implement all the methods that are declare in super class if we create another abstract class
// But we cannot instantiate the abstract class
abstract class HR extends Havi {

	// inherited method
	void employeeDetails4() {

	}

	// own method (new method)
	void companyDetails() {

	}
}

	public class Abstract_3 {
		public static void main(String[] args) {
	
			Havi h1 = new Admin();
			h1.employeeDetails1();
			h1.employeeDetails2();
			
			// we can not create object for abstract class
			//  HR h2 = new HR();
	
			
			
		}
	
	}
