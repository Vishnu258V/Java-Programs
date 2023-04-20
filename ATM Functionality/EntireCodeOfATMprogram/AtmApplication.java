package EntireCodeOfATMprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;


// Custom Exceptions
//------------------
class CustomExceptions extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomExceptions(String message) {
		super(message);        
	}
}

class WrongPassword extends Exception {
	private static final long serialVersionUID = 1L;

	public WrongPassword(String message) {
		super(message);
	}
}

class InsufficientFunds extends Exception {
	private static final long serialVersionUID = 1L;

	public InsufficientFunds(String message) {
		super(message);
	}
}

//User Info
//---------
class UserInfo {

	private int accountNumber;
	private int pinNumber;
	private double savingAccBalance;
	private double currentAccBalance;

	// Getters
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getSavingAccBalance() {
		return savingAccBalance;
	}

	public double getCurrentAccBalance() {
		return currentAccBalance;
	}

	// Setters
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public void setSavingAccBalance(double savingAccBalance) {
		this.savingAccBalance = savingAccBalance;
	}

	public void setCurrentAccBalance(double currentAccBalance) {
		this.currentAccBalance = currentAccBalance;
	}

	public void balanceSetup() {
		OptionsMenu op1 = new OptionsMenu();

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=demo;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";
			String query = "select [Account Number], [Pin Number], Balnance  from [AccountCredentials];";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);

			// Using a statement interface we can create and execute the SQL query
			Statement stm = con.createStatement();

			// to get results in set format
			ResultSet result = stm.executeQuery(query);

			while (result.next()) {
				int acn = result.getInt("Account Number");
				int balnce = result.getInt("Balnance");
				
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

// Options Display
//-----------------
class OptionsMenu extends UserInfo {

	Scanner sc = new Scanner(System.in);
// To Store the Login credentials like AccountNumber, PinNumber
	HashMap<Integer, Integer> loginCredentials = new HashMap<>();

// to store the balance and account numbers
	HashMap<Integer, Integer> balance = new HashMap<>();

	public void getLogin()
			throws WrongPassword, InputMismatchException, InsufficientFunds, ClassNotFoundException, SQLException {
//		loginCredentials.put(11111111, 1234);
//		loginCredentials.put(22222222, 1221);
//		loginCredentials.put(33333333, 2222);
//		loginCredentials.put(44444444, 2345);
//		loginCredentials.put(55555555, 2311);
//		loginCredentials.put(66666666, 7895);
//		loginCredentials.put(77777777, 6354);
//		loginCredentials.put(88888888, 4589);

		// Jdbc Connection
		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=demo;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";
			String query = "select [Account Number], [Pin Number], Balnance  from [AccountCredentials];";
			// String updtateQuery = "update [AccountCredentials] set [Balnance]=? where
			// [Account Number]=?";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);

			// Using a statement interface we can create and execute the SQL query
			Statement stm = con.createStatement();

			// to get results in set format
			ResultSet result = stm.executeQuery(query);

			while (result.next()) {
				int acn = result.getInt("Account Number");
				int pin = result.getInt("Pin Number");
				int balnce = result.getInt("Balnance");
				loginCredentials.put(acn, pin);
				balance.put(acn, balnce);
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// System.out.println("\n\n"+loginCredentials);
		}

		// ATM Interface
		// ------------------
		int count = 0;
		while (count != 1) {
			try {
				System.out.println(" Welcome to ATM! ");

				System.out.println("\nEnter the Account Number :");
				int accountNumber = sc.nextInt();
				setAccountNumber(accountNumber);
				setSavingAccBalance(balance.get(accountNumber));
				setCurrentAccBalance(balance.get(accountNumber));

				System.out.println("Enter the Password : ");
				int password = sc.nextInt();
				setPinNumber(password);

			} catch (InputMismatchException e) {
				System.out.println("\nInavid Characters,Please Enter only numbers");
				count = 1;
			} catch (Exception e) {
				System.out.println("Wrong Account Number ");
				count = 1;
			}

			break;
		}

		// to check weather AccountNumber and PinNumber Available or not
		if (loginCredentials.containsKey(getAccountNumber())
				&& getPinNumber() == loginCredentials.get(getAccountNumber())) {
			AccountType();
		} else {
			throw new WrongPassword("Wrong Account Credentials! ");
		}

	}

	// Account Type Ex- Savings, Current
	public void AccountType() throws InputMismatchException, InsufficientFunds, ClassNotFoundException, SQLException {
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
			System.out.println(" \nThank you for using this ATM!");
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

		System.out.println("\nTransaction On :\nDate " + Date + "\nTime " + Time);

	}

	public void SavingsAccount() throws InsufficientFunds, ClassNotFoundException, SQLException {
		System.out.println("\n\t\tChoose the Saving Account Functions :");
		System.out.println("1 - Balance Check ");
		System.out.println("2 - Deposit ");
		System.out.println("3 - Withdraw ");
		System.out.println("4 - Exit");

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Connection String
		String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=demo;integratedSecurity=true;trustServerCertificate=true;";
		String passwrd = "ATMApplication";
		String userName = "ATMApplication";
		String query = "select [Account Number], [Pin Number], Balnance  from [AccountCredentials];";
		String updtateQuery = "update [AccountCredentials] set [Balnance]=? where [Account Number]=?";

		Connection con = DriverManager.getConnection(url, passwrd, userName);
		PreparedStatement prsmt = con.prepareStatement(updtateQuery);

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
			setSavingAccBalance(depositAmount + getSavingAccBalance());
			System.out.print("Total Balance - " + getSavingAccBalance());

			// Updating the balance to the database
			prsmt.setDouble(1, getSavingAccBalance());
			prsmt.setInt(2, getAccountNumber());
			prsmt.executeUpdate();

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

					// Updating the balance to the database
					prsmt.setDouble(1, getSavingAccBalance());
					prsmt.setInt(2, getAccountNumber());
					prsmt.executeUpdate();

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

	public void CurrentAccount()
			throws InsufficientFunds, InputMismatchException, ClassNotFoundException, SQLException {
		System.out.println("\n\t\tChoose the Current Account Functions :");
		System.out.println("1 - Balance Check ");
		System.out.println("2 - Deposit ");
		System.out.println("3 - Withdraw ");
		System.out.println("4 - Exit");

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Connection String
		String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=demo;integratedSecurity=true;trustServerCertificate=true;";
		String passwrd = "ATMApplication";
		String userName = "ATMApplication";
		String query = "select [Account Number], [Pin Number], Balnance  from [AccountCredentials];";
		String updtateQuery = "update [AccountCredentials] set [Balnance]=? where [Account Number]=?";

		Connection con = DriverManager.getConnection(url, passwrd, userName);
		PreparedStatement prsmt = con.prepareStatement(updtateQuery);

		int CurrentOption = sc.nextInt();

		switch (CurrentOption) {
		case 1:
			System.out.print("Avialable balance - " + getCurrentAccBalance());
			displayTimeAndDate();
			AccountType();
			break;
		case 2:
			System.out.print("Enter the Amount to Deposit : ");
			double depositAmount = sc.nextDouble();
			setCurrentAccBalance(depositAmount + getSavingAccBalance());
			System.out.print("Total Balance - " + getCurrentAccBalance());

			// Updating the balance to the database
			prsmt.setDouble(1, getCurrentAccBalance());
			prsmt.setInt(2, getAccountNumber());
			prsmt.executeUpdate();

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

					// Updating the balance to the database
					prsmt.setDouble(1, getCurrentAccBalance());
					prsmt.setInt(2, getAccountNumber());
					prsmt.executeUpdate();

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

// Main Method
// -----------
public class AtmApplication {
	public static void main(String[] args) throws Exception {

		OptionsMenu op = new OptionsMenu();

		try {
			op.getLogin();

			// Custom Exception
		} catch (WrongPassword e) {
			System.out.println(e.getMessage());
		}

//		UserInfo u1 = new UserInfo();
//		u1.balanceSetup();
//		

	}
}
