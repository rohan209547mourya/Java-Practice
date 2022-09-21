package problem3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	 
	public <Payment> void doTransactions(List<Payment> list) {
		 
		for(Payment el : list) {
			
			if(el instanceof CashPayment) {
				
				((CashPayment) el ).doPayment();
			}
			else {
				
				((CardPayment) el ).doPayment();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		List<CashPayment> list1 = new ArrayList<>();
		List<CardPayment> list2 = new ArrayList<>();
		
		list1.add(new CashPayment(8000));
		list1.add(new CashPayment(7000));
		list2.add(new CardPayment(6000));
		list2.add(new CardPayment(9000));
		
	
		
		d1.doTransactions(list1);
		d1.doTransactions(list2);
	}
}
