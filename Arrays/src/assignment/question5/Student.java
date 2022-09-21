package question5;

public class Student {

	private int rollNumber;
	private int marks;
	private String address;
	private String name;
	
	Student() {
		
	}
	
	Student(int roll , int mark , String add , String name) {
		
		this.rollNumber = roll;
		this.marks = mark;
		this.address = add;
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Marks: " + this.marks);
		System.out.println("Roll Number: "+ this.rollNumber);
		System.out.println("****************************");
	}
}
