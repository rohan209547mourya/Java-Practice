package assignment.problem3;

public class Account {
	
	private String accountNumber;
	private double balance;
	
	
	void deposit(int amount) {
		
		this.balance += amount;
	}
	
	double withdrow(int amount) throws InsufficientFundsException{
		
		double amountToBeReturn;
		
		if(amount < this.balance) {
			
			this.balance =  this.balance - amount;
			
			amountToBeReturn = amount;
			
		}
		else {
			
			InsufficientFundsException el = new InsufficientFundsException("Not Enough amount to withdraw!");
			
			throw el;			
		}
		
		
		return amountToBeReturn;
		
	}
	


	public Account() {
		super();
	}

	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
