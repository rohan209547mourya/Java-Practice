package assignment.problem5;

import java.util.Scanner;

public class Main {
	
	void registerUser(String userName , String userCountry) throws InvalidCountryException{
			
		
		if(userCountry.equalsIgnoreCase("india")) {
			
			System.out.println("User registration done successfully");
			
		}
		else {
			
			InvalidCountryException el = new InvalidCountryException("User Outside India cannot be registered");
			
			throw el;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = sc.nextLine();
		
		System.out.println("Enter your country name: ");
		String country = sc.next();
		
		Main user = new Main();
		
		try {
			
			user.registerUser(name, country);
		} 
		catch (InvalidCountryException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thank you!");
	}
}
