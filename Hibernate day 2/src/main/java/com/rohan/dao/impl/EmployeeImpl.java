package com.rohan.dao.impl;

import javax.persistence.EntityManager;

import com.rohan.dao.EmployeeDao;
import com.rohan.entity.Employee;
import com.rohan.exception.EmployeeException;
import com.rohan.utilities.GetConnection;

public class EmployeeImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		Employee employee1 = null; 
		
		
		EntityManager em =  GetConnection.get();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Employee registered successfully !");
		
		return employee1;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		
		Employee employee = null;
		
		
		EntityManager eManager = GetConnection.get();
		
		employee = eManager.find(Employee.class, empId);
		
		
		if(employee == null) {
			
			throw new EmployeeException("There is no Employee with this id !");
		}
		
		eManager.close();
		
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		
		Employee employee = null;

		EntityManager  eManager = GetConnection.get();
		
		eManager.getTransaction().begin();
		
		employee = eManager.find(Employee.class, empId);
		
		eManager.remove(employee);
		
		eManager.getTransaction().commit();
		
		
		eManager.close();
		
		if(employee == null) {
			
			throw new EmployeeException("No record in the database !");
		}
		
		System.out.println("Employee deleted successfully !");
		
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		
		
		
		return null;
	}

}
