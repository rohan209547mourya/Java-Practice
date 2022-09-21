package question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Ticket newTicket = new  Ticket();
		
		System.out.print("Enter Number of Ticket you want to book: ");
		int numberOfTicket = sc.nextInt();
		
		int cost = newTicket.calculateTicketCost(numberOfTicket);

		
		if(cost != -1) {
			
		    System.out.println("Ticket Id: " + newTicket.getTicketId());
			System.out.println("Total Amount: " + cost);
			System.out.println("Ticket Still Available: " + Ticket.availableTicket);
			
		}
		else {
			
			System.out.println("No more booking available.");
		}
	}

}
