package RestWebServicedemo.FirstRestWebservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Controller  
@RestController
public class ServiceController {
	
	//using get method and hello-world as URI  
	@GetMapping(path = "/getAllUsers")
	public String getAllUsers() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindata", "root", "12345678");  
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from userdetails");
           


      
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
		return "\nThese are the avialable details";

	}

	
	@GetMapping(path = "/hello-world-bean")
	public Model helloWorldBean() {
		return new Model("Vishnu258", "vishnu16039@gmail.com", 7893240720l, "Vishnu@123"); // constructor of Model class
	}
	
	
}