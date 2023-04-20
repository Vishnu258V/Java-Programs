package Date_19_12_2022;

import java.util.Scanner;

public class ValidatingTheUserNames {

	public static void main(String[] args) {

		System.out.print("Enter the User Name  : ");

		Scanner sc = new Scanner(System.in);

		String userName = sc.nextLine();
		int count = 0;

		for (int i = 0; i < 1; i++) {

			for (char j = 48; j < 58; j++) {

				if (userName.charAt(i) == j) {
					count++;
				}
			}
		}

		//System.out.println(count);

		if (userName.length() >= 8 && userName.length() <= 30) {

			if (userName.charAt(0) != '_') {

				if (count == 0) {
					int temp = 0;
					for (int i = 0; i < userName.length(); i++) {

						char ch = userName.charAt(i);
						char sartingNumber = 48;
						char lastNumber = 58;

						if ((ch > 'A' & ch < 'Z') && (ch > 'a' & ch < 'z' )&& ch < sartingNumber || ch > lastNumber ) {
							temp = 1;
						}

					}

					if (temp == 0) {
						System.err.println("Invalid, User Name should not have Special Characters ");
					} else {
						System.out.println("Valid");
					}
				} else {
					System.err.println(
							"Invalid, User Name should Not Start with Numbers, it should start with Lettrs only ");
				}

			} else {
				System.err.println(
						"Invalid, User Name should Start either with Capital or Small letters, No Special Characters allowed");
			}

		} else if (userName.length() <= 8) {

			System.err.println("Invalid, User name Must have 8 Characters");
		} else if (userName.length() > 30) {

			System.err.println("Invalid, User name Must not Exceed 30 Characters");
		} else {
			System.err.println("Invalid");
		}

	}
}
