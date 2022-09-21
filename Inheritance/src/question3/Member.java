package question3;

public class Member {

	
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;
	
	
	Member(){
		

	}
	
	
	Member(String name , String address , int age , String phno, double sal){
			
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phno;
		this.salary = sal;
	}
	
	void printSalary() {
		
		System.out.println("Salary: " + this.salary);
	}
}

