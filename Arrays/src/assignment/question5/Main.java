package question5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Students Object?: ");
		int n = sc.nextInt();
		
		Student[] newStudent = new Student[n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter Details of Student " + (i+1));
			System.out.println("*********************************");
			
			System.out.println("Enter Student name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Enter address: ");
			String address = sc.nextLine();
			
			System.out.println("Enter roll number: ");
			int roll = sc.nextInt();
			
			System.out.println("Enter marks obtain: ");
			int marks = sc.nextInt();
			
			newStudent[i] = new Student(roll, marks, address, name);
			System.out.println("*********************************");
		}

		int totalMarks = 0;
		for(Student i:newStudent) {
			i.printDetails();
			totalMarks = i.getMarks();
		}
		
		System.out.println(totalMarks / newStudent.length);
	}

}
