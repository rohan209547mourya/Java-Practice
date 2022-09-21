package strings;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		
		int a = sc.nextInt();
		
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		
		System.out.println("Enter the character position you want to access: ");
		int index = sc.nextInt();
		
		System.out.println("Character at position " + index + " is: " + input.charAt(index));
	}

}
