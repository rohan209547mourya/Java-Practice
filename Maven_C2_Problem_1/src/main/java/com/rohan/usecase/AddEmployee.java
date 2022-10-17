package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.entity.Address;
import com.rohan.entity.Employee;

public class AddEmployee {
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name : "); 
		String name = sc.nextLine();
		
		
		System.out.println("Enter Employee's City : ");
		String city = sc.nextLine();
		
		
		System.out.println("Enter Employee's State : ");
		String state = sc.nextLine();
		
		
		System.out.println("Enter Employee's Pincode : ");
		String pin = sc.nextLine(); 
		
		System.out.println("Enter Employee's Salary : ");
		int sal = sc.nextInt();
		
		
		EmployeeDao em = new EmployeeImpl();
		em.addEmployee(new Employee(name, sal, new Address(city, state, pin)));
		
		
		System.out.println("Employee Added !" );
		
		sc.close();
	}

}
