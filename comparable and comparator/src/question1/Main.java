package question1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		
		int i = 0;
		
		while(i < 4) {
				
			System.out.println("Enter details for Product " + (i + 1));
			System.out.println("_________________________________");
			
			
			System.out.println("Enter Product Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter Product ID: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Product Price: ");
			int price  = sc.nextInt();
			
			sc.nextLine();
			
			list.add(new Product(id, name, price));	
			i++;
		}
		
		
		System.out.println("Press button to sort product accordingly!");
		System.out.println(
		
				"○ 1 for sorting the product according to the productPrice \r\n"
				+ "○ 2 for sorting the product according to the productName \r\n"
				+ "○ 3 for sorting the product according to the productId \r\n"
				+ ""
				
		);
		
		int choise  = sc.nextInt();
		
		switch (choise) {
		case 1: {
			list.sort(new ProductPrice());
			break;
		}
		case 2 : {
			
			list.sort(new ProductName());
			break;
		}
		case 3 : {
			
			list.sort(new ProductId());
			break;
		}
		default:
			list.sort(new ProductId());
		}
		
		System.out.println(list);
	}
}
