package problem3;


public class CardPayment implements Payment{
	
	private int amount;
	
	public CardPayment() {
		
	}
		
	public CardPayment(int amount) {
		
		this.amount = amount;
	}

	@Override
	public void doPayment() {
		
		System.out.println("Payment done by card " + this.amount);
	}
	
	
		
}
