package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Main obj = new Main();
		
		Connection c1 = obj.getConnection();
		
		
		
//		try {
//			
//			obj.insertDepartment(c1);
//		} 
//		catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
		
//		try {
//			
//			obj.insertEmployee(c1);
//		} 
//		catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
//		try {
//			obj.deleteDepart(c1);
//		} 
//		catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		
		try {
			obj.getMumbai(c1);
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		String url = "jdbc:mysql://localhost:3306/rohanmain";
		
		Connection connect = null;
		
		try{
			
			 connect  = DriverManager.getConnection(url , "root" , "rohan@2004");
			
		} 
		catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return connect;
	}
	
	public void insertEmployee(Connection c1 ) throws SQLException {
		
		PreparedStatement insert  = c1.prepareStatement("insert into EMPLOYEE values(? , ? , ? , ? , ?)");
		
		System.out.println("Enter Employee ID: ");
		insert.setInt(1, sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		insert.setString(2, sc.nextLine());
		
		System.out.println("Enter Employee Address: ");
		insert.setString(3, sc.nextLine());
		
		
		System.out.println("Enter Employee Mobile No: ");
		insert.setString(4, sc.nextLine());
		
		System.out.println("Enter Employee Department ID: ");
		insert.setInt(5 , sc.nextInt());
		
		int temp = insert.executeUpdate();
		
		if(temp > 0) {
			
			System.out.println("Employee added!");
		}
		else {
			
			System.out.println("Something went wrong!");
		}
	}
	
	
	public void insertDepartment(Connection c1) throws SQLException {
		
		
		PreparedStatement insert =  c1.prepareStatement("insert into DEPARTMENT values(? , ? , ?)");
		
		System.out.println("Enter Department ID: ");
		insert.setInt(1, sc.nextInt());
		
		
		sc.nextLine();
		
		System.out.println("Enter Department name: ");
		insert.setString(2, sc.nextLine());
		
		
		System.out.println("Enter Department Location: ");
		insert.setString(3, sc.nextLine());
		
		int temp = insert.executeUpdate();
		
		if(temp > 0)
			System.out.println("Department Added!");
		else
			System.out.println("Something went wrong!");
	}
	
	
	public void deleteDepart(Connection c1) throws SQLException {
		
		
		PreparedStatement delete =  c1.prepareStatement("delete from DEPARTMENT where did = ?");
		
		PreparedStatement r1 = c1.prepareStatement("delete from EMPLOYEE Swhere deptid = ?");
		
		
		System.out.println("Enter Department ID: ");
		
		int temp = sc.nextInt();
		
		delete.setInt(1, temp);
		
		r1.setInt(1, temp);
		r1.executeUpdate();
		
		if(delete.executeUpdate() > 0) {
			
			System.out.println("Department removed!");
			
		}
		else {
			
			System.out.println("No Department with this ID!");
		}
		
	}
	
	public void getMumbai(Connection c1) throws SQLException {
		
		
		PreparedStatement p1 =  c1.prepareStatement("select d.dname , d.location , e.ename , e.mobile,e.address from employee e INNER JOIN department d where e.address = 'mumbai' AND e.deptid = d.did");
		
		ResultSet res =  p1.executeQuery();
		
		
		while(res.next()) {
			
			
			System.out.println("| Department Name: " + res.getString("d.dname") + "  | Department Location: " + res.getString("d.location") + "  | Employee Name: " + res.getString("e.ename") +  "   | Employee Mobile: "  + res.getString("e.mobile") + "  | Employee Address: "   + res.getString("e.address") +" |");		
			
		}
		
	}
	
}	
