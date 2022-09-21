package problem2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Product> products = new PriorityQueue<>();
		
		System.out.print("Enter number of product you want to add: "); 
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter Details for " + (i+1));
			System.out.println("============================");
			System.out.println("Enter Product name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Product Price: ");
			int price = sc.nextInt();
			
			System.out.println("Enter Product ID: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			products.add(new Product(id, name, price));
		}		
		
		
		
		Iterator<Product> itr = products.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			System.out.println("=============================");
		}
	}
}
