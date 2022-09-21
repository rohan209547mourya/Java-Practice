package question3;

public class TemporaryEmployee extends Employee{
	
	
	
	private int hourseWorked;
	private int hourlyWages;

	public TemporaryEmployee(int employeeId, String employeeName, int worked , int wages) {
		super(employeeId, employeeName);
		
		this.hourlyWages = wages;
		this.hourseWorked = worked;
	}

	@Override
	void calculateSalary() {
		
		double temp = this.hourlyWages * this.hourseWorked;
		
		
		super.salary = temp;
		
		System.out.println(super.salary);
	}
	
	
}
