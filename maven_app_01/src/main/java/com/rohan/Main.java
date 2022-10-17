package com.rohan;

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
		
		String url = "jdbc:mysql://localhost:3306/auction_main";
		
		try {
			
			Connection conn = DriverManager.getConnection(url , "root" , "rohan@2004");
			
			System.out.println(conn);
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	
}
