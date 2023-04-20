package ATM_Application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionsMenu extends UserInfo {
	Scanner sc = new Scanner(System.in);
// To Store the Login credentials like AccountNumber, PinNumber
	HashMap<Integer, Integer> loginCredentials = new HashMap<>();

	public void getLogin() throws WrongPassword, InputMismatchException, InsufficientFunds {
		loginCredentials.put(11111111, 1234);
		loginCredentials.put(22222222, 1234);
		loginCredentials.put(33333333, 1234);
		loginCredentials.put(44444444, 1234);
		loginCredentials.put(55555555, 1234);
		loginCredentials.put(66666666, 1234);

		int count = 0;

		while (count != 1) {

			try {
				System.out.println(" Welcome to ATM! ");
				System.out.println("\nEnter the Account Number :");
				int accountNumber = sc.nextInt();
				setAccountNumber(accountNumber);

				System.out.println("Enter the Password : ");
				int password = sc.nextInt();
				setPinNumber(password);

			} catch (Exception e) {
				System.out.println("\nInavid Characters,Please Enter only numbers");
				count = 1;
			}

			break;
		}

// to check weather AccountNumber and PinNumber Available or not
		if (loginCredentials.containsKey(getAccountNumber()) && loginCredentials.containsValue(getPinNumber())) {
			AccountType();
		} else {
			throw new WrongPassword("Wrong Account Credentials! ");
		}

	}

// Account Type Ex- Savings, Current
	public void AccountType() throws InputMismatchException, InsufficientFunds {
		System.out.println(" \nChoose the Account Type by Numbers only ");
		System.out.println("1 - Savings Account\t\t2 - Current Account");
		System.out.println("3 - Exit");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			try {
				SavingsAccount();
			} catch (InsufficientFunds e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try {
				CurrentAccount();
			} catch (InsufficientFunds e) {

				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println(" \nThanks for using this ATM!");
			break;
		default:
			System.out.println("Invalid Option, Please select as per your Account type");
			AccountType();
			break;
		}

//				System.out.println("Options Should be in Integer Value not by any character values");
//				System.out.println("Enter the Correct Option :");

	}

	public void displayTimeAndDate() {
		LocalDate todayDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();

		DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String Date = todayDate.format(DateFormat);

		DateTimeFormatter TimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		String Time = currentTime.format(TimeFormat);

		System.out.println("Transaction On :\nDate " + Date + "\nTime " + Time);

	}

	public void SavingsAccount() throws InsufficientFunds {
		System.out.println("\n\t\tChoose the Saving Account Functions :");
		System.out.println("1 - Balance Check ");
		System.out.println("2 - Deposit ");
		System.out.println("3 - Withdraw ");
		System.out.println("4 - Exit");

		int SavingOption = sc.nextInt();

		switch (SavingOption) {
		case 1:
			System.out.print("Available Balance - " + getSavingAccBalance());

			displayTimeAndDate();
			AccountType();
			break;
		case 2:
			System.out.print("Enter the Amount to Deposit : ");
			double depositAmount = sc.nextDouble();
			setSavingAccBalance(depositAmount);

			displayTimeAndDate();
			AccountType();
			break;
		case 3:
			System.out.print("Enter the Amount to Withdraw : ");
			int withdrawAmount = sc.nextInt();

			if (withdrawAmount % 100 == 0) {

				if (withdrawAmount <= getSavingAccBalance()) {

					System.out.println("Please Collect Cash!");
					System.out.println("Remaining Balance - " + (getSavingAccBalance() - withdrawAmount));
					setSavingAccBalance(getSavingAccBalance() - withdrawAmount);
				} else {

					throw new InsufficientFunds("Insufficient Funds! add some account to Account ");
				}
			} else {

				System.out.println("Please enter amount in multiples of 100s ");
			}

			displayTimeAndDate();
			AccountType();

			break;
		case 4:
			System.out.println("Thank you!");

			displayTimeAndDate();
			AccountType();
			break;

		default:

			displayTimeAndDate();
			AccountType();
			break;
		}

	}

	public void CurrentAccount() throws InsufficientFunds {
		System.out.println("\n\t\tChoose the Current Account Functions :");
		System.out.println("1 - Balance Check ");
		System.out.println("2 - Deposit ");
		System.out.println("3 - Withdraw ");
		System.out.println("4 - Exit");

		int CurrentOption = sc.nextInt();

		switch (CurrentOption) {
		case 1:
			System.out.println("Avialable balance - " + getCurrentAccBalance());

			displayTimeAndDate();
			AccountType();
			break;
		case 2:
			System.out.print("Enter the Amount to Deposit : ");
			double depositAmount = sc.nextDouble();
			setCurrentAccBalance(depositAmount);

			displayTimeAndDate();
			AccountType();
			break;
		case 3:
			System.out.print("Enter the Amount to Withdraw : ");
			int withdrawAmount = sc.nextInt();

			if (withdrawAmount % 100 == 0) {

				if (withdrawAmount <= getCurrentAccBalance()) {

					System.out.println("Please Collect Cash!");
					System.out.println("Remaining Balance - " + (getCurrentAccBalance() - withdrawAmount));
					setCurrentAccBalance(getCurrentAccBalance() - withdrawAmount);
				} else {

					throw new InsufficientFunds("Insufficient Funds! add some amount to Account ");
				}
			} else {

				System.out.println("Please enter amount in multiples of 100s ");
			}

			displayTimeAndDate();
			AccountType();
			break;
		case 4:
			System.out.println("Thank You!");

			displayTimeAndDate();
			AccountType();
			break;

		default:

			displayTimeAndDate();
			AccountType();
			break;
		}

	}

}