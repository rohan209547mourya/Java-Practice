package question5;

public class Employee {
	
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public Employee() {
		
	}
	
	public Employee(int id , String name , double sal) {
		this.employeeId = id;
		this.employeeName = name;
		this.salary = sal;
	}
	
	public void calculateNetSalary(int pfPercentage) {
		
		netSalary = salary - ((salary * pfPercentage) / 100);
		
	}
	
	
	public void printDetails() {
		System.out.println("Employee id: " + this.employeeId);
		System.out.println("Employee Name: " + this.employeeName);
		System.out.println("Employee Salary: " + this.salary);
		System.out.println("Employee Net Salary: "+ this.netSalary);
		
	}
	

}
