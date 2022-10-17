package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.entity.Employee;
import com.rohan.exception.EmployeeException;


public class RegisterEmployee {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Employee Name: ");
		String name =  scanner.nextLine();
		
		
		System.out.println("Enter Employee Address: ");
		String address = scanner.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		int salary = scanner.nextInt();
		
		Employee employee = new Employee();
		
		employee.setName(name);
		employee.setAddress(address);
		employee.setSalary(salary);
		
		scanner.close();
		
		EmployeeDao employeeDao =  new EmployeeImpl();
		
		try {
			
			employeeDao.registerEmployee(employee);
		} 
		catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
