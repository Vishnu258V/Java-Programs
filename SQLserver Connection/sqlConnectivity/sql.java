package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sql {

	public static void main(String[] args) {

		try {
																									//encrypt=false;
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;databaseName=demo;integratedSecurity=true;trustServerCertificate=true;";
			Connection conn = DriverManager.getConnection(url);
			System.out.println("connection is sucessful");

		} catch (SQLException e) {

			System.out.println("connection failed");

			System.out.println(e);
		}

		
		
		
  }
}
