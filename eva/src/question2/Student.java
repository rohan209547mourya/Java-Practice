package question2;

public class Student {

	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student(){
		
	}
	
	
	public Student(int roll , int mark ,String name) {
		
		this.rollNumber = roll;
		this.studentName = name;
		this.marks = mark;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
