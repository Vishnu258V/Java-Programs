package StudentDetailsWithoutDataBase;
import java.util.HashMap;
import java.util.Scanner;

public class OptionsMenu {

	{
		System.out.println("\n\t\t\tWelcome to the Student Portal!");
	}

	Scanner sc = new Scanner(System.in);
	String option;

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	// To Store the Student Data
	HashMap<Integer, StudentDetails> map = new HashMap<>();
	int count = 1;
//	int breakingCount = 0;
//	int tempCount = 0;
	
	public void chooseOptions() throws InputMisType {
		System.out.print("\n\t\tChoose the operations that you wanted to perfom : \n");

		System.out.println("1 - Enter the Student Details to Store ");
		System.out.println("2 - Enter the Student Id to Get the details");
		System.out.println("3 - Get all the available Student Details");
		System.out.println("4 - Delete the Student Details for Particular ID");
		System.out.println("5 - EXIT");

		String optionNumber = sc.next();
		setOption(optionNumber);
		System.out.println(getOption());
		if (getOption().equals("1") || getOption().equals("2") || getOption().equals("3") || getOption().equals("4")
				|| getOption().equals("5")) {
			count = 0;
		} else {
			System.out.println("\nInput MisMatch, please choose the options with Correct integer value only ");
		}

		if (count == 0) {
			functions();
		}

	}

	public void functions() throws InputMisType {
		switch (getOption()) {
		case "1":
			enterStudentDetails();
			chooseOptions();
			break;
		case "2":
			getStudentData();
			chooseOptions();
			break;
		case "3":
			getAllStudentsData();
			chooseOptions();
			break;
		case "4":
			deleteStudentData();
			chooseOptions();
			break;
		case "5":
			System.out.println("Thank You for using Student Portal!");

			break;
		default:
			System.out.println("\nEnter the Correct Option in Integer Format :");
			chooseOptions();
			break;
		}
	}

	// To Enter Details
	public void enterStudentDetails() throws InputMisType {	
		boolean err = true;

			int Id = 0;
			try {
				System.out.print("\nEnter Student Id, it should be in integer format  : ");
				Id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter First Name : ");
				String fName = sc.nextLine();

				System.out.print("Enter Last Name : ");
				String lName = sc.nextLine();

				System.out.print("Enter College Name : ");
				String collName = sc.nextLine();

				System.out.print("Enter Location : ");
				String loca = sc.nextLine();

				map.put(Id, new StudentDetails(Id, fName, lName, collName, loca));
				System.out.println("");
			} catch (Exception e) {

				System.out.println("\nInput MisMatch, please Enter integer value only");
				err = false;
			}
	}
	

	// to Get the Individual Data According to the Student ID
	int inputId2 = 0;
	public void getStudentData() throws InputMisType {
		System.out.print("\n\nEnter the Student Id to get the Details : ");
		int inputId = sc.nextInt();
		inputId2 = inputId;

		if (map.containsKey(inputId)) {
			System.out.println(map.get(inputId));
		} else {
			ifDataNotAvailable();
		}
	}
	

	// to add data if Not Available
	public void ifDataNotAvailable() throws InputMisType {
		System.out.println("Student data for the Id- " + inputId2 + " is Not Available  ");
		System.out.println("\nChoose to Perfom Particular  Operation for this particular Id-" + inputId2);
		System.out.println("Enter- 1  :  Create new data on Id-" + inputId2);
		System.out.println("Enter- 2  :  Exit without Creating Student Data");
		int newOption = 0;
		try {
			newOption = sc.nextInt();

		} catch (Exception e) {
			System.out.println("\nInput MisMatch, please choose the options with integer value only \n" + e);
			count = 1;
		}

		switch (newOption) {
		case 1:
			enterStudentDetails();
			break;
		case 2:
			chooseOptions();
			break;
		default:
			System.out.println("\nChoose the Correct Option ");
			break;
		}
	}

	// to Get the All Data According to the Student ID
	public void getAllStudentsData() throws InputMisType {
		if (!(map.isEmpty())) {
			for (int i : map.keySet()) {
				System.out.println("\n" + map.get(i));
			}
		} else {
			ifDataNotAvailable();
		}
	}

	// To delete the Student Data for the Particular ID
	public void deleteStudentData() throws InputMisType {
		System.out.print("\n\nEnter the Student Id to Remove the Data from portal : ");
		int removeId = sc.nextInt();
		inputId2 = removeId;

		if (map.containsKey(removeId)) {

			map.remove(removeId);
			System.out.println("\nRemaining Data :");
			if (!(map.isEmpty())) {
				for (int i : map.keySet()) {
					System.out.println("\n" + map.get(i));
				}
			}

		} else {
			ifDataNotAvailable();
		}

	}
}
