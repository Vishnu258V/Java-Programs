package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class UpdatingAndGettingDataFromServer {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		HashMap<Integer, Integer> loginCredentials = new HashMap<>();
		
		
		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=demo;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";
			String query = "select [Account Number], [Pin Number], [Balnance]  from [AccountCredentials];";
			
			String query2 = "update [AccountCredentials] set [Balance=0] where [Account Number = 11111111] ";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);

			// Using a statement interface we can create and execute the SQL query
			Statement stm = con.createStatement();
	
			ResultSet result = stm.executeQuery(query);

			while (result.next()) {
				int acn = result.getInt("Account Number");
				int balnce = result.getInt("Balnance");
				System.out.println(acn+" "+balnce);
				loginCredentials.put(acn, balnce);
			}

		} catch (ClassNotFoundException e) {
 
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		System.out.println("\n\n");

		for (Integer i : loginCredentials.keySet()) {
			System.out.println(i +" = "+ loginCredentials.get(i));
		}
	
		
		
		
		
		//Querry for updating the records.

		//int c=st.executeUpdate("update emp_dets set empname='Shivu' ,empsal=7500.00 where empid=104");

		//System.out.println("Data updated "+c);
		
		
		
		
		
		
	}
}
