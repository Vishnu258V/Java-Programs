package Date_19_12_2022;

public class ExceptionalHandlingBasic {

	public static void main(String[] args) {

		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = i;
		}

		try {

			for (int i = 0; i <= ar.length; i++) {
				System.out.println(ar[i]);
			}

		} catch (ArithmeticException arth) {

			System.err.println(arth);
		} catch (ArrayIndexOutOfBoundsException arr) {

			System.err.println(arr);
		} catch (Exception e) {

			System.err.println("Unknown Exception");
		}

		System.out.println("\nRest of the code Executed ");

		for (int i : ar) {

			System.out.println(i);
		}

	}
}
