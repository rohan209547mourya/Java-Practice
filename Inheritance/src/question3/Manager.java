package question3;

public class Manager extends Member{
	
	private String department;
	private String Specialisation;
	
	public Manager() {
		super();
	}
	
	public Manager(String n , String add , String dep , String special ,int age , String phNo , double sal) {
		
		super(n , add , age , phNo , sal);
		this.department = dep;
		this.Specialisation = special;
	}

}
