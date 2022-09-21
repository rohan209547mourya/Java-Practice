package question1;

public class Student extends Person{
	
	private int studentId;
	private int courseFee;
	private String courseEnrolled;
	private Person p1;
	
	
	public Student () {
		
	}
	
	public Student(String name, String gender , String city , String state , String pincode , int studentId, int courseFee, String courseEnrolled) {
		super();
		this.studentId = studentId;
		this.courseFee = courseFee;
		this.courseEnrolled = courseEnrolled;
		
		p1  = new Person(name , gender);
		
		p1.setCity(city);
		p1.setPinCode(pincode);
		p1.setState(state);
	}
	
	
	public String toString() {
		
		String city = p1.getCity();
		String state = p1.getState();
		String pin = p1.getPinCode();
		return "Student [studentId: " + this.studentId + ", courseFee: " + this.courseFee + ", courseEnrolled: " + this.courseEnrolled + ", Address [city: " + city + ", state: " + state + ", pincode: " + pin + "]]";
	}
	
}
