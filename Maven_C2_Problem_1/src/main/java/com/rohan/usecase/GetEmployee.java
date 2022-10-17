package com.rohan.usecase;

import java.util.Scanner;

import com.rohan.dao.EmployeeDao;
import com.rohan.dao.impl.EmployeeImpl;
import com.rohan.exception.EmployeeException;

public class GetEmployee {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Department name : ");
		
		String name = scanner.nextLine();
		
		
		EmployeeDao em = new EmployeeImpl();
		
		try {
			
			em.getAllEmployeeWithDeptName(name).forEach(s -> System.out.println(s));
		} 
		catch (EmployeeException e) {
			
			e.printStackTrace();
		}
		scanner.close();
		
	}
}
