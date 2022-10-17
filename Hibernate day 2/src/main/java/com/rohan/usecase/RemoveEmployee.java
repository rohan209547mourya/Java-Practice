package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.exception.EmployeeException;

public class RemoveEmployee {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Employee ID: ");
		int empId =  scanner.nextInt();
		
		
		EmployeeDao employeeDao = new EmployeeImpl();
		
		
		try {
			
			employeeDao.deleteEmployeeById(empId);
		}
		catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		scanner.close();
	}
}
