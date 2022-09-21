package assignment;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String str) {
		
		String newStr = "";
		
		String[] tempArr = str.split("");
		
		for(int i = tempArr.length - 1; i >= 0; i--) { 
			
			newStr += tempArr[i];
		}
		
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String you want to reverse: ");
		String str = sc.nextLine();
		
		
		String reversedString = reverseString(str);
		
		System.out.println(reversedString);
		
	}

}
