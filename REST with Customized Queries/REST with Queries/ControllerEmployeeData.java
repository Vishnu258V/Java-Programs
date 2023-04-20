package lastRest.APIwithSQL.Querys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerEmployeeData {

	@GetMapping("/hello")
	@ResponseBody
	public String getHello() {
		String s = "Hello vishnu";
		return s;
	}

	@GetMapping("/RstAPI/getAllEmployees")
	@ResponseBody
	public Map<String, employeeData> getAlldata() {

		HashMap<String, employeeData> getData = new HashMap<>();

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);
			String query = "select * from employeeData";
			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query);

			while (rst.next()) {
				getData.put(rst.getString(1), new employeeData(rst.getInt(1), rst.getString(2), rst.getInt(3),
						rst.getString(4), rst.getLong(5), rst.getString(6)));
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return getData;
	}

	@GetMapping("/RstAPI/getEmployeeById/{id}")
	@ResponseBody
	public Map<String, employeeData> getEmployeeById(@PathVariable String id) {

		HashMap<String, employeeData> getData = new HashMap<>();

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);
			String query = "select * from employeeData where e_empId=" + id + "";
			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(query);

			while (rst.next()) {
				getData.put(rst.getString(1), new employeeData(rst.getInt(1), rst.getString(2), rst.getInt(3),
						rst.getString(4), rst.getLong(5), rst.getString(6)));
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return getData;
	}

	@PostMapping("/RstAPI/postEmployeeData")
	public ResponseEntity<Map<String, employeeData>> postEmployeeData(@RequestBody employeeData empData) {
		int temp = 0;

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);
			String query = "insert into employeeData \r\n" + "values(?,?,?,?,?,?);";

			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, empData.getE_empId());
			pstm.setString(2, empData.getE_name());
			pstm.setInt(3, empData.getE_age());
			pstm.setString(4, empData.getE_department());
			pstm.setLong(5, empData.getE_salary());
			pstm.setString(6, empData.getE_address());

			int result = pstm.executeUpdate();
			temp = result;

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (temp == 1) {
			return new ResponseEntity<>(HttpStatus.CREATED);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}

	}

	@PutMapping("/RstAPI/modifyEmployeeData/{id}")
	public ResponseEntity<Map<String, employeeData>> putEmployeeData(@PathVariable String id,
			@RequestBody employeeData empData) {
		int temp = 0;

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);
			String query = "Update employeeData SET e_empId=?,e_name=?,e_age=?,e_department=?,e_salary=?,e_address=? WHERE e_empId ="
					+ id + ";";

			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, empData.getE_empId());
			pstm.setString(2, empData.getE_name());
			pstm.setInt(3, empData.getE_age());
			pstm.setString(4, empData.getE_department());
			pstm.setLong(5, empData.getE_salary());
			pstm.setString(6, empData.getE_address());

			int result = pstm.executeUpdate();
			temp = result;

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (temp == 1) {
			return new ResponseEntity<>(HttpStatus.CREATED);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}

	}

	@DeleteMapping("RestAPI/deleteEmployeeData/{id}")
	public ResponseEntity<employeeData> putEmployeeData(@PathVariable String id) {
		int temp = 0;

		try {
			// Jdbc sql server Driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Connection String
			String url = "jdbc:sqlserver://DESKTOP-G8KD2J6;Database=employee;integratedSecurity=true;trustServerCertificate=true;";
			String passwrd = "ATMApplication";
			String userName = "ATMApplication";

			// registering or loading the connection
			Connection con = DriverManager.getConnection(url, passwrd, userName);
			String sql = "DELETE FROM employeeData WHERE e_empId=" + id + "";

			PreparedStatement statement = con.prepareStatement(sql);

			int result = statement.executeUpdate();
			temp = result;

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (temp == 1) {
			return new ResponseEntity<>(HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}

	}

}
