package assignment.problem3;

public class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException() {
		
	}
	
	public InsufficientFundsException(String massage) {
		
		super(massage);
	}
}
