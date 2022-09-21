package problem3;

public class CashPayment implements Payment{

	private int amount;
	
	
	
	public CashPayment() {
		
	}
	
	public CashPayment(int amount) {
		
		this.amount = amount;
	}

	@Override
	public void doPayment() {
		
		System.out.println("Payment done by cash of " + this.amount);
	}

		
}
