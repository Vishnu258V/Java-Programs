package FinalAssesmentModifications;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

//Create a class FulltimeEmployee with following properties Name, Employee id , Create Date, Date Of Birth, Age
//•	Create a scanner to collect information from user input for FulltimeEmployee and populate values in
//	FulltimeEmployee   object (create 3 to 5)
//•	Create a Hash Map to FulltimeEmployee details key is employee id
//•	Sort the hash map for most recent employee
//•	Loop through HashMap and save each employee details into database
//•	Add exception handling for null date, database exceptions


class employee implements Comparable<employee>  {
	private String name ;
	private int empId;
	private String createDate;
	private String dob;
	private int age;
	
	public employee(String name, int empId, String cDate, String eDOB, int age) {
		this.name = name;
		this.empId = empId;
		this.createDate = cDate;
		this.dob = eDOB;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "employee name   =" + name + ", "
				+ "\nempId      =" + empId + ", "
				+ "\ncreateDate =" + createDate + ", "
				+ "\ndob        =" + dob + ","
				+ "\nage        ="+ age ;
	}

	@Override
	public int compareTo(employee o) {
		return createDate.compareTo(o.createDate);
	}

}

public class FullTimeEmployee {
	public static void main(String[] args) {

		System.out.print("Enter the num of employee details going to add : ");
		Scanner sc = new Scanner(System.in);
		int noOf = sc.nextInt();
		
		HashMap< Integer, employee> map = new HashMap<>();
		
		while(noOf > 0 ) {
		System.out.print("\nEnter the Employee Name : ");
			sc.nextLine();
		String eName = sc.nextLine();
		System.out.print("Enter the Employee Id : ");
		int Id = sc.nextInt();
		System.out.print("Enter the Employee Create Date(dd-mm-yyy) in this format only  : ");
		sc.nextLine();
		String cDate = sc.next();
		System.out.print("Enter the Employee Date of Birth : ");
		sc.nextLine();
		String eDOB = sc.next();
		System.out.print("Enter the Employee Age : ");
		int eAge = sc.nextInt();
		
			map.put(Id, new employee(eName, Id, cDate, eDOB, eAge));
			

			try {
				// Jdbc sql server Driver
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

				// Connection String
				String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=demo;integratedSecurity=true;trustServerCertificate=true;";
				String passwrd = "ATMApplication";
				String userName = "ATMApplication";
				String inserting = "INSERT INTO FullTimeEmployeeDetails VALUES()";


				// registering or loading the connection
				Connection con = DriverManager.getConnection(url, passwrd, userName);

				// Using a statement interface we can create and execute the SQL query
				Statement stm = con.createStatement();
		
				ResultSet result = stm.executeQuery(inserting);


			} catch (ClassNotFoundException e) {
	 
				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}		
			
			
			noOf--;
		}
		
		System.out.println("\n\t\t\tDetails Saved SuccessFully ! ");
		TreeMap<Integer, employee> tr1 = new TreeMap<>(map);
		System.out.println("\n");
		for( Entry<Integer, employee> e : map.entrySet()   ) {
			
			System.out.println(e);
			System.out.println();
	}
	

		
		
	}

}
