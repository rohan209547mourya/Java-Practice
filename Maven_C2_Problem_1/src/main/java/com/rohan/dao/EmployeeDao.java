package com.rohan.dao;

import java.util.List;

import com.rohan.entity.Department;
import com.rohan.entity.Employee;
import com.rohan.exception.DepartmentException;
import com.rohan.exception.EmployeeException;

public interface EmployeeDao {

	
	
	public void addDepartment(Department dept);
	
	public void addEmployee(Employee emp);	
	
	public void registerEmployeeTODepartment(int empId, int deptId)throws EmployeeException, DepartmentException;
	
	List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException;
	
	Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentException;


	
}
