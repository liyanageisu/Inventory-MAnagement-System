import java.sql.*;  
public class NewClass{  
	public static Connection getConnection() throws Exception{ 
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");     
			return con;	
		}  
	}  