package question4;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	/*
	*
	*
	*
	1: Find Employee in Particular Department
	2: Remove Particular Employee
	3: Print Employees in All Departments
	*
	*
	*
	*/

	
	
	public static List<Employee> employees = new ArrayList<>(); 
	static Scanner sc = new Scanner(System.in);
	static int numberOfEmp = 0;
	
	
	public static void main(String[] args) {
		
		
		System.out.println("...Welcome to Employee Management System....");
		firstInput();
		
	}
	
	public static void firstInput() {
		
		System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
		
		String yn = sc.next();
		
		if(yn.equalsIgnoreCase("y")) {
			
			addEmployee();
		}
		else {
			System.out.println("Thank You !");
			choise();
		}
		
	}
	
	
	public static void addEmployee() {
		
		numberOfEmp++;
		System.out.println("Enter the Employee Details: " + numberOfEmp);
		System.out.println("_________________________________");
		
		
		System.out.println("Enter the Employee Id:");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the Employee Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee Salary:");
		int salary = sc.nextInt();
		
		System.out.println("Enter the Department Id:");
		int depId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the Department Name:");
		String depName = sc.nextLine();
			
		Department dep = new Department(depId , depName);
		
		employees.add(new Employee(id, name, salary, dep));
		
		System.out.println("Employee Details added successfully..");
		
		firstInput();
	}
	
	public static void choise() {
		
		System.out.println("Enter the your choice");
		System.out.println("1: Find Employee in Particular Department");
		System.out.println("2: Remove Particular Employee");		
		System.out.println("3: Print Employees in All Departments");
		
		int choiseNumber = sc.nextInt();
		
		
		if(choiseNumber == 1) {
			findEmp();
		}
		else if(choiseNumber == 2) { 
			removeEmp();
		}
		else if(choiseNumber == 3) {
			printAllEmp();
		}
		else {
			System.out.println("Invaild Input!");
		}
	}
	
	
	public static void removeEmp() {
		
		System.out.println("Enter empolyee id: ");
		int id = sc.nextInt();
		
		boolean flag = false;
		int index = 0;
		
		for(Employee el : employees) {
			
			if(id == el.getEmployeeId()) {
				
				flag = true;
				
				index = employees.indexOf(el);
			}
		}
		
		if(flag) {
			
			
			employees.remove(index);
			
			System.out.println("Employee removed successfully!");
		}
		
		
		System.out.println("Do you want to exit? (Y/N) ");
		String yn = sc.next();
		
		if(yn.equalsIgnoreCase("y")) {
			
			System.out.println("Thank You!");
		}
		else {
			
			choise();
		}
		
	}
	
	
	public static void printAllEmp() {
		
		for(Employee el : employees) {
			
			System.out.println(el.toString());
			System.out.println("_________________________________________________________________");
		}
		
		
		System.out.println("Do you want to exit? (Y/N) ");
		String yn = sc.next();
		
		if(yn.equalsIgnoreCase("y")) {
			
			System.out.println("Thank You!");
		}
		else {
			
			choise();
		}
	}
	
	
	public static void findEmp() {
		
		System.out.println("Enter department id: ");
		int depId = sc.nextInt();
		
		boolean flag = false;
		
		for(Employee el : employees) {
			
			if(depId == el.getDepartment().getDepartmentId()) {
				
				flag = true;
				System.out.println(el.toString());
			}
		}
		
		if(flag) {
			
			System.out.println("No Employee in this department");
		}
		
		
		System.out.println("Do you want to exit? (Y/N) ");
		String yn = sc.next();
		
		if(yn.equalsIgnoreCase("y")) {
			
			System.out.println("Thank You!");
		}
		else {
			
			choise();
		}
		
	}
	
}

