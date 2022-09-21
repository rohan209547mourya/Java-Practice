package question4;

import java.util.Scanner;

public class Main {
	
	public static void getLaptop(String laptopPurpose) {
		Laptop lap = new Laptop(laptopPurpose);
		lap.displayDetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the purpose of laptop: ");
		String purpose = sc.next();
		
		getLaptop(purpose);

	}

}
