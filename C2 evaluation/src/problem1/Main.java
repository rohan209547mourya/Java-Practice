package problem1;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Library lab = new Library();
	
	public static void main(String[] args) {
		
		start();
		
	}
	
	static void start() {
		
		System.out.println("1.Add Book \r\n" + 
					"2.Display all book details \r\n" + 
					"3.Search Book by author \r\n" +
					"4.Search book by ISBN \r\n" +
					"5.Exit \r\n");
		
		System.out.println("Press the button: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
			case 1: {
				
				addBooks();
				break;
			}
			case 2:{
				
				displayDetails();
				break;
			}
			case 3:{
				
				searchBookAuth();
				break;
			}
			case 4:{
				
				searchISBN();
				break;
			}
			case 5: {
				
				System.out.println("Thank You!");
				break;
			}
		}
	}
	
	static void addBooks() {
		System.out.println("Enter Book Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Book Author: ");
		String auth = sc.nextLine();
		
		System.out.println("Enter Book ISBN Number: ");
		int isbn = sc.nextInt();
		
		try {
			
			lab.addBook(new Book(isbn, name, auth));
		}
		catch(BookException el) {
			
			System.out.println(el.getMessage());
		}
		
		start();
	}
	
	static void displayDetails() {
		
		try {
			
			lab.viewAllBooks().forEach(s -> System.out.println(s));
		}
		catch(BookException el) {
			
			System.out.println(el.getMessage());
		}
		
		start();
	}
	
	
	static void searchBookAuth() {
		
		System.out.println("Enter Book Author name: ");
		String auth = sc.nextLine();
		
		try {
		
			lab.viewBooksByAuthor(auth).forEach( s -> System.out.println(s));
		}
		catch(BookException el) {
			
			
			System.out.println(el.getMessage());
		}
		
		start();
	}
	
	
	static void searchISBN() {
		
		
		System.out.println("Enter ISBN Number Of Book: ");
		int num = sc.nextInt();
		
		try {
			
			System.out.println(lab.getBookByISBN(num));
		}
		catch(BookException el) {
			
			System.out.println(el.getMessage());
		}
		
		start();
	}
	
}
