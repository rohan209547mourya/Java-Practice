package com.library;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1. Add Book");
		System.out.println("2. Display all book details");
		System.out.println("3. Search book by author");
		System.out.println("4. Count number of books - by book name");
		System.out.println("5. Exit");
		
		System.out.println("Enter your choise: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		Library lib = new Library();
		
		
		if(input == 1) {
			
			System.out.println("Enter ISBN Number: ");
			int number = sc.nextInt();
			
			System.out.println("Enter Book Name: ");
			sc.nextLine();
			
			String bookName = sc.nextLine();
			
			System.out.println("Enter Book Author Name: ");
			
			String auth = sc.nextLine();
			
			lib.addBook(new Book(number, auth, bookName));
		}
		else if(input == 2) {
			
			List<Book> returnList = lib.viewAllBooks();
		}
		else if(input == 3) {
			System.out.println("Enter Author Name: ");
			
			String name = sc.nextLine();
			
			List<Book> returnList = lib.viewAllBooksByAuthor(name);
		}
		else if(input == 4) {
			
			System.out.println("Enter Book name: ");
			String name = sc.nextLine();
			
			int numberOfBooks = lib.countNoOfBooks(name);
			
			System.out.println(numberOfBooks);
		}
	}
}
