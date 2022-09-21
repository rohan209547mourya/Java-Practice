package question1;

public class Main {

	public static Person generatePerson(Person p1) {
		
		String temp = p1.toString();
		
		System.out.println(temp);
		
		return p1;
	}
	
	
	
	public static void main(String[] args) {
		
		Person p1 = generatePerson(new Instructor("Rohan", "Male", "New Delhi", "Delhi", "110071", 12313, 100000));
		
		Person p2 = generatePerson(new Student("Ramesh", "Male", "New Delhi", "Delhi", "110221", 3213, 40000, "JA111"));
	}

}
