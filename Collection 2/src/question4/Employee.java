package question4;

import java.util.Objects;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	public Employee() {
		super();
	}


	public Employee(int employeeId, String employeeName, int employeeSalary, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = (double)(employeeSalary);
		this.department = department;
	}
	
	@Override
	public String toString() {
		
		return "Employee[Name => " + this.employeeName + ", ID => " + this.employeeId + ", Salary => " + this.employeeSalary + " " + department.toString() +"]";
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(this.employeeId);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e1 = (Employee) obj;
		
		return e1.getEmployeeId() == e1.getEmployeeId();
	}
	
}
