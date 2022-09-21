package assignment.problem1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		try {
			String n = sc.next();
			int k = Integer.parseInt(n);
			
			System.out.println(k*k);
		}
		catch(NumberFormatException el) {
			
			System.out.println("Entered input is not a valid format for an integer");
		}
		
	}
}
