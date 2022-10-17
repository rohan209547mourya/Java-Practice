package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.entity.Department;


public class AddDepartment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Department Name : ");
		
		String name = sc.nextLine(); 
		
		System.out.println("Enter Department Location : ");
		String location = sc.nextLine();
 		
		
		EmployeeDao employeeDao = new EmployeeImpl();
		
		employeeDao.addDepartment(new Department(name, location));
		
		System.out.println("Department added !");
		
		sc.close();
	}
}
