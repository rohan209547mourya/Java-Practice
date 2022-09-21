package question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		Member e1 = new Employee("harry" , "New Delhi" , "Tech" , "Software Development" , 18 , "12443323" , 70000);
		Member m1 = new Manager("Nrupul" , "Gurugaon" , "Tech" , "Project Management" , 31 , "213847283" , 150000);
		
		
		e1.printSalary();
		m1.printSalary();

	}

}
