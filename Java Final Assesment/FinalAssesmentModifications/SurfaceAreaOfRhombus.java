package FinalAssesmentModifications;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SurfaceAreaOfRhombus {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		double d1;
		double d2;
		try {

			System.out.print("Enter the value of the 1st daignol : ");
			d1 = sc.nextDouble();

			System.out.print("Enter the value of the 2nd daignol : ");
			d2 = sc.nextDouble();
		} catch (Exception e) {

			System.out.println();
			throw new InputMismatchException("\n->Please Enter Integer Values or Decimal Values !  ");
		}

		if (d1 > 0 && d2 > 0) {
			double surfaceArea = (d1 * d2) / 2;
			System.out.println("\nTotal Surface Area : " + surfaceArea);

		} else {
			throw new Exception(
					"\n->Enter the Positive Integer Values of the Rhombus \n->Measurements Should be Positive Values ");
		}

	}

}
