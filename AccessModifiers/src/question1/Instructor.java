package question1;

public class Instructor extends Person{
	
	private int instructorId;
	private int salary;
	private Person p1;
	
	
	public Instructor() {
		
	}
	
	public Instructor(String name , String gender , String city , String state , String pincode , int id , int salary) {
		
		this.instructorId = id;
		this.salary = salary;
		
		p1 = new Person(name, gender);
		
		p1.setCity(city);
		p1.setPinCode(pincode);
		p1.setState(state);
	}
	
	
	public String toString() {
		
		String city = p1.getCity();
		String state = p1.getState();
		String pin = p1.getPinCode();
		
		return "Instructor [Instructor ID: " + this.instructorId + ", Salary: " + this.salary + ", Address: ["
				 + "City: " + city + ", State: " + state + ", Pin Code: " + pin + "]]";
	}
}
