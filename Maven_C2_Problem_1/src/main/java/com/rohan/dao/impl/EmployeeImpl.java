package com.rohan.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.rohan.dao.EmployeeDao;
import com.rohan.entity.Department;
import com.rohan.entity.Employee;
import com.rohan.exception.DepartmentException;
import com.rohan.exception.EmployeeException;
import com.rohan.utility.GetConnection;

public class EmployeeImpl implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {
		
		
		EntityManager eManager = GetConnection.get();
		
		eManager.getTransaction().begin();
		
		eManager.persist(dept);
		
		eManager.getTransaction().commit();
		
		eManager.close();
	}

	@Override
	public void addEmployee(Employee emp) {
		
		
		EntityManager eManager = GetConnection.get();
		
		eManager.getTransaction().begin();
		
		eManager.persist(emp);
		
		eManager.getTransaction().commit();
		
		eManager.close();
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		
		
		EntityManager em = GetConnection.get();
		
		Department department =  em.find(Department.class, deptId);
		
		Employee employee = em.find(Employee.class, empId);
		
		if(department == null) {
			
			throw new DepartmentException("No department found with this id!");
		}
		
		if(employee == null) {
			
			throw new EmployeeException("No employee found with this id!");
		}
		
		em.getTransaction().begin();
		
		
		department.getEmpList().add(employee);
		employee.setDeptEmp(department);
		
		em.getTransaction().commit();
		
		
		em.close();
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		
		List<Employee> res = null;
		
		
		EntityManager em = GetConnection.get();
		
		String query = "select b from Department b where deptName = :name"; 
		
		Query result = em.createQuery(query);
		
		result.setParameter("name", deptName);
		
		Department dep = (Department) result.getSingleResult();
		
		res = dep.getEmpList();
		
		if(res.size() == 0) {
			
			throw new EmployeeException("There is no employee working in this department");
		}
		
		
		em.close();
		return res;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		
		
		EntityManager em = GetConnection.get();
		
		Employee employee = em.find(Employee.class, empId);
		
		
		Department department = employee.getDeptEmp();
		
		if(department == null) {
			
			
			throw new DepartmentException("This is employee is not working in any department");
		}
		
		return department;
	}

	
	
}
