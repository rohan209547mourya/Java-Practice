package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.entity.Employee;
import com.rohan.exception.EmployeeException;

public class FindEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Employee Id: ");
		int empId =  sc.nextInt();
		
		EmployeeDao emp = new EmployeeImpl();
		
		try {
			
			Employee employee =  emp.getEmployeeById(empId);
			System.out.println(employee);
		} 
		catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
		
	}
}
