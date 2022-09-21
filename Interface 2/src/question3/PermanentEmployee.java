package question3;

public class PermanentEmployee extends Employee{
	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double pay) {
		
		super(employeeId, employeeName);
		
		this.basicPay = pay;
	}

	

	@Override
	void calculateSalary() {
		
		super.salary = this.basicPay - (this.basicPay * 0.12);
		System.out.println(super.salary);
	}
}
