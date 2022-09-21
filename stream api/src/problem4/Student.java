package problem4;

public class Student {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	private String name;
	private int marks;
	
	
	
}
