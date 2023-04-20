package Date_20_12_2022;

class superone {

	public void array() {

		int[] a = new int[10];

		for (int i = 0; i <= a.length; i++) {
			a[i] = 10 * i;
		}

		for (int i : a) {
			System.out.println(i);
		}
	}

	public void devide(int i, int n) throws Exception {
		int a = i;
		int b = n;

		if (n == 0) {
			throw new Exception("Denominator should not be 0 ");
		}

		int c = i / n;
		System.out.println(c);

	}
}

public class HandelingErrorsInMethods {
	public static void main(String[] args) throws Exception {

		superone s1 = new superone();

		try {
			s1.devide(40, 0);
			s1.array();
		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

		try {
			// s1.devide(40, 0);
			s1.array();
		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}
}
