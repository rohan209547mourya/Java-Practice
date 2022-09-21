package question4;

import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Roll: ");
		int roll = sc.nextInt();
		
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		
		Student s1 = new Student(roll, marks, name);
		
		s1.calculateGrade();
		s1.displayDetails();
	}
}
