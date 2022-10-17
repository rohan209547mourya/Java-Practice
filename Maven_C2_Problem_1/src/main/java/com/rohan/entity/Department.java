package com.rohan.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int depId;
	private String deptName;
	private String location;
	
	
	public List<Employee> getEmpList() {
		return empList;
	}


	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}


	@OneToMany
	@Cascade(value = CascadeType.ALL)
	private List<Employee> empList;
	
	public Department() {
		super();
	}
	
	
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}


	public int getDepId() {
		return depId;
	}


	public void setDepId(int depId) {
		this.depId = depId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [depId=" + depId + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	
	
}
