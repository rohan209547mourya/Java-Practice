package question3;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		Loan loan = Loan.getLoan();
		
		double loanForPermanetEmp =  loan.calculateLoanAmount(new PermanentEmployee(232, "Rohan Mourya", 1000));
		
		double loanForTempEmp = loan.calculateLoanAmount(new TemporaryEmployee(343, "Sunny Mourya", 20, 100));
		
		
		System.out.println("Loan Amount for Permanent Employee is => " + loanForPermanetEmp);
		System.out.println("Loan Amount for Temporary Employee is => " + loanForTempEmp);
	}
}
