package assignment.problem3;

public class AccountDemo {
	
	public static void main(String[] args) {
		
		Account user = new Account("32428432784", 500);
		
		user.deposit(1000);
		
		try {
			
			user.withdrow(2000);
		} 
		catch (InsufficientFundsException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thank you for using masai national bank");
	}
}
