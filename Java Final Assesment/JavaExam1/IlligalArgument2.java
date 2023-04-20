package JavaExam1;

public class IlligalArgument2 {

	public static double divide(double a, double b) throws Exception {

		if (a > 0) {
			return a / b;
		} else {
			throw new Exception("The divisor is ZERO");
		}

	}

	public static void main(String[] args) throws Exception {

		IlligalArgument2.divide(-1, 0);

	}

}
