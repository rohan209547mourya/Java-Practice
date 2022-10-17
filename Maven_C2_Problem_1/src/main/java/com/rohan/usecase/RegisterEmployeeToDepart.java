package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.exception.DepartmentException;
import com.rohan.exception.EmployeeException;

public class RegisterEmployeeToDepart {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Employee Id: ");
		int eid = sc.nextInt();
		
		System.out.println("Enter Department Id: ");
		int did = sc.nextInt();
		
		EmployeeDao em = new EmployeeImpl();
		
		try {
			
			em.registerEmployeeTODepartment(eid, did);
			
			System.out.println("Employee Added to Department !");
		} 
		catch (EmployeeException e) {
			
			e.printStackTrace();
		} 
		catch (DepartmentException e) {
			
			e.printStackTrace();
		}
		
		sc.close();
	}
}
