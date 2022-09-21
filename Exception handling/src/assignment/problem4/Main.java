package assignment.problem4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter two number: ");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("The quotient of " + a +"/"+ b + " = " + (a/b));
			
		}
		catch (ArithmeticException el) {
			
			System.out.println("DivideByZeroException caught");
		}
		finally {
			
			System.out.println("Inside finally block");
		}
		
	
		
	}
}
