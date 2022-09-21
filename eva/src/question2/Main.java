package question2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students do you want to add: ");
		int n = sc.nextInt();
		int i = 0;

		
		while(i < n) {
			
			System.out.println("Enter Student Roll Number: ");
			int roll = sc.nextInt();
			
			System.out.println("Enter Student Total Marks Obtain: ");
			int marks = sc.nextInt();
			
					
			System.out.println("Enter Student Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			
			
			Student newStudent = new Student(roll , marks , name);
			
			System.out.println("Student Name: " + newStudent.getStudentName());
			System.out.println("Student Roll Number: " + newStudent.getRollNumber());
			System.out.println("Student Marks: " + newStudent.getMarks());
			
			System.out.println("****************************************");
		}
		
	}

}
