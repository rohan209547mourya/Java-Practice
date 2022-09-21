package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many passangers?: ");
		int passangers = sc.nextInt();
		
		System.out.println("How much Kilo Meters?: ");
		int kiloMeters = sc.nextInt();
		
		OLA myOla = new OLA();
		
		Car c1 = myOla.bookCar(passangers, kiloMeters);
		
		int fare = myOla.calculateBill(c1);
		
		System.out.println("The Total amount of fare is " + fare);
	}
}
