package strings;

import java.util.Scanner;

public class Course {
	
	private int courseId;
	private String courseName;
	private int courseFee;
	
	Course() {
		
	}
	
	Course(String name , int id , int fee) {
		
		this.courseFee = fee;
		this.courseId = id;
		this.courseName = name;
	}
	
	
	void displayCourseDetails() {
		
		System.out.println("Course ID: " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Fee" + courseFee);
	}
	
	public static void authenticate(String username , String password) {
			if(username.equals("Admin") && password.equals("1234")) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter course name: ");
				String course = sc.nextLine();
				
				System.out.println("Enter course id: ");
				int id = sc.nextInt();
				
				System.out.println("Enter course fee: ");
				int fee = sc.nextInt();
				
				
				Course admin = new Course(course , id , fee);
				
				admin.displayCourseDetails();
			}
			else {
				
				System.out.println("Invaild username and password!");
			}
	}
	
	
	public static void main(String[] args) {
		
		authenticate("Admin", "1234");
		
		authenticate("Admin", "12345");
	}
}
