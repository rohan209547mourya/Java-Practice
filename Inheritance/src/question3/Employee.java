package question3;

public class Employee extends Member {
	
	private String department;
	private String Specialisation;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String n , String add , String dep , String special ,int age , String phNo , double sal) {
		
		super(n , add , age , phNo , sal);
		this.department = dep;
		this.Specialisation = special;
	}
}
