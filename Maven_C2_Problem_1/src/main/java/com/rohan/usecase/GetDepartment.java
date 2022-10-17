package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.exception.DepartmentException;

public class GetDepartment {

	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee Id: ");
		
		
		EmployeeDao em = new EmployeeImpl();
		
		try {
			
			System.out.println(em.getDepartmentDetailsByEmployeeId(scanner.nextInt()));
		} 
		catch (DepartmentException e) {
			
			
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
