package newtestproject;

import java.sql.*;

public class jdbcnewtestproject{

public static void main(String args[]) {

try{

//step1 load the driver class 
	Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create the connection object Connection 
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","eeshwar","Eeshwar123");
//step3 create the statement object 
	Statement stmt=con.createStatement();

//step4 execute query

ResultSet rs=stmt.executeQuery("select * from studentgrouping"); 
while(rs.next()) 
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

//steps close the connection object

con.close();

}catch(Exception e) { System.out.println(e);}}
}