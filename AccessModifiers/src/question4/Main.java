package question4;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pass a number between 1 to 10: ");
		
		int num = sc.nextInt();
		
		if(num < 1 || num > 10) {
			
			System.out.println("Invalid input!");
		}
		else {
			Parent p1 = new Child(num);
			
			p1.method1();
			p1.method2();
			p1.method3();
			
			Child c1 = (Child) p1;
			
			c1.method4();
		}
	}
}
