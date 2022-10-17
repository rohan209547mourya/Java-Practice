package com.rohan.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private int salary;
	
	@Embedded
	private Address address;
	
	@OneToOne
	@Cascade(value = CascadeType.ALL)
	private Department deptEmp;
	
	public Department getDeptEmp() {
		return deptEmp;
	}

	public void setDeptEmp(Department deptEmp) {
		this.deptEmp = deptEmp;
	}

	public Employee() {

	}

	public Employee(String empName, int salary, Address address) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	

	
	
}
