package question5;

import java.util.Scanner;

public class Main {
	
	public static void getEmployeeDetails(int id , String name ,double salary , int pfPercent) {
		Employee e1 = new Employee(id, name, salary);
		e1.calculateNetSalary(pfPercent);
		e1.printDetails();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		
		System.out.println("Enter Salary: ");
		double sal = sc.nextInt();
		
		
		System.out.println("Enter PF percentage: ");
		int pf = sc.nextInt();
		
		getEmployeeDetails(id, name, sal, pf);

	}
}
