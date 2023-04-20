package sqlConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 

public class Mysql {

 

    public static void main(String[] args)
    {
        Connection con =null;
        Statement st=null;
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver classes are loded successfully");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
            System.out.println("Connection established between java and database");
            st=con.createStatement();
            System.out.println("Statement is created");
            //Querry for inserting the records. 
            //int b=st.executeUpdate("insert into emp_dets values(105,'Rajesh',5500.00)");
            //System.out.println("Data inserted "+b);


            //Querry for updating the records.
            //int c=st.executeUpdate("update emp_dets set empname='Shivu' ,empsal=7500.00 where empid=104");
            //System.out.println("Data updated  "+c);


            // Querry for Deleting Records
            //int d=st.executeUpdate("delete from emp_dets where empid=103");
            //System.out.println("Data deleted  "+d);


            //Queery for Fetching the Records from Database
            ResultSet rs=st.executeQuery("select * from emp_dets");
            System.out.println("Employee details are ");
             while(rs.next())
             {
                 int id=rs.getInt(1);
                 String name=rs.getString(2);
                 double sal=rs.getDouble(3);
                 System.out.println("Emp id  "+id);
                 System.out.println("EmpName "+name);
                 System.out.println("EmpSal  "+sal);

                 System.out.println("---------------------------------------------");
             }

            con.close();
            st.close();
            rs.close();

        }
        catch (ClassNotFoundException | SQLException e) 
        {

            e.printStackTrace();
        }

 

    }

 

}