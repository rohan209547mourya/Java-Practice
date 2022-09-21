package question3;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		
		if(employeeObj instanceof PermanentEmployee) {
			
			employeeObj.calculateSalary();
			
			double res = employeeObj.salary * 15 / 100;
			
			return res;
		}
		else {
			
			employeeObj.calculateSalary();
			
			double res = employeeObj.salary * 10 / 100;
			
			return res;
		}		
	}
	
	
	private Loan() {
		
	}
	
	public static Loan getLoan() {
		
		return new Loan();
	}
	
}
