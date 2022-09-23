package newjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/rohanmain";
		
		
		
		try {
			
			Connection connect = DriverManager.getConnection(url, "root", "rohan@2004");
			
			System.out.println(connect);
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
