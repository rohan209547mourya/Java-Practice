package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	static <E> List<E> returnList(List<E> list) {
		
		
		for(E el : list) {
			
			System.out.println(el);
		}
		
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<String> list = new ArrayList<>();
		
		System.out.println("How many Elements you wants to put? : ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter " + (i+1)+"th element: ");
			
			String str = sc.nextLine();
			
			list.add(str);
		}
		
		returnList(list);
	}
	
}
