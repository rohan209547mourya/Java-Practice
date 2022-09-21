package question3;
import java.lang.Math;

public class Ticket {
	
	private int ticketId;
	private int price = 250;
	
	static int availableTicket = 25;
	
	
	public int calculateTicketCost(int noOfTicket) {
		
		ticketId = (int)(Math.floor((Math.random() + 1000 - 1 ) * 1000));
		
		if(availableTicket >= noOfTicket) {
			
			availableTicket -= noOfTicket;
			
			return noOfTicket * price;
		}
		
		return -1;
	}


	public int getTicketId() {
		return ticketId;
	}

	public int getPrice() {
		return price;
	}


}
