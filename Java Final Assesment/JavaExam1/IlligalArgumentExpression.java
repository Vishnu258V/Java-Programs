package JavaExam1;

public class IlligalArgumentExpression {
	
	public static double divide(double a, double b) {
		return a / b;
		}


	public static void main(String[] args) {

		try {
			IlligalArgumentExpression.divide("hii", 0);
		} catch (Exception e) {

			System.out.println(e);
		}
		
	}

}
