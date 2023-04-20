package Date_20_12_2022;
/*
 Qns:   Given two integers (positive , negative or even 0) say a and b. Find the minimum value of (a$b) 
	  where $ is any arithmetic operation like multiply(*), Divide(/), Addition(+),Subtraction(-). 
	  Use Exception Handling in this problem.
*/

class calculation {

	int sum = 0;
	int div = 0;
	int mul = 0;
	int sub = 0;

	public void findMinimum(int x, int y) {

		sum = x + y;
		mul = x * y;
		sub = x - y;

		try {

			if (y == 0) {
				throw new ArithmeticException("Denominator must be not equal to Zero");
			}
			div = x / y;

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println();
		System.out.println("sum = " + sum);
		System.err.println("div = " + div);
		System.out.println("mul = " + mul);
		System.out.println("sub = " + sub);
//		
	}

}

public class ExceptionsUsingThrow$Throws {

	public static void main(String[] args) {

		calculation c1 = new calculation();
//		c1.findMinimum(50, 25);
		c1.findMinimum(50, 0);
//		c1.findMinimum(50, 50);
//		c1.findMinimum(0, 0);

	}

}
