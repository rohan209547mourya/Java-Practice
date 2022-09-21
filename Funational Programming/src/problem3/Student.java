package problem3;

public class Student {
	
	private int roll;
	private int marks;
	private String name;
	private String email;
	public Student(int roll, int marks, String name, String email) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + ", email=" + email + "]";
	}
	public Student() {
		super();
	}
	
	
	
	
	
}
