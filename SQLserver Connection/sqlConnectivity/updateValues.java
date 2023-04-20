package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class updateValues {
	public static void main(String[] args) {

		// Connection String
		String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=demo;integratedSecurity=true;trustServerCertificate=true;";
		String passwrd = "ATMApplication";
		String userName = "ATMApplication";
		
		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);
			
			String query = "select [Account Number], [Pin Number], [Balnance]  from [AccountCredentials];";
			String query2 = "UPDATE [AccountCredentials] set [Balnance]=? where [Account Number]= ?";

			PreparedStatement prsmt = con.prepareStatement(query2);
			prsmt.setDouble(1,10000);
			prsmt.setInt(2, 22222222);
			prsmt.executeUpdate();

			System.out.println("Success");
			java.sql.Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query);
			
			while(rst.next()) {
				double balance = rst.getDouble("Balnance");
				System.out.println(balance);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
