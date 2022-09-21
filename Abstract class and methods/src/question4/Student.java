package question4;

public class Student {
	
	private int roll;
	private int marks;
	private String name;
	private char grade;
	
	
	public Student() {
		
	}
	
	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	public void displayDetails() {
		
		System.out.println(this.toString());
	}
	
	public String toString() {
		
		return "Student [Roll: "+ this.roll + ", Name: " + this.name + ", Marks: " + this.marks + ", Grade: " + this.grade + "]";
	}
	
	
	public void calculateGrade() {
	
		this.calGrade();
	}
	
	private char calGrade() {
		
		if(this.marks >= 500) {
			
			this.grade = 'A';
		}
		else if(this.marks < 500 && this.marks >= 400) {
			
			this.grade = 'B';
		}
		else {
			
			this.grade = 'C';
		}
		
		return this.grade;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
}
