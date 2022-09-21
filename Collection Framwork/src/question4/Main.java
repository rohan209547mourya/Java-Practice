package question4;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void LabAssistence(int choise , Library lab) {
		
		Scanner sc = new Scanner(System.in);
		
		if(choise == 5) {
			
			System.out.println("Thank you 😊😊😊😊");
			return;
		}
		
		if(choise == 1) {
			
			System.out.print("Enter ISBN number of book: ");
			int isbn = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter book name: ");
			String bookName = sc.nextLine();
			
			System.out.println("Enter author name: ");
			String authorName = sc.nextLine();
			
			lab.addBook(new Book(isbn , bookName , authorName));
			
			System.out.println("Book added succesfully!");
		}
		else if(choise == 2) {
			
			
			List<Book> arr = lab.viewAllBooks();
			
			if(arr.size() == 0) {

				System.out.println("Sorry there is no Book in Libaray!"); 
			}
			
			for(Book i : arr) {
				
				int isbn = i.getIsbn();
				String name = i.getBookName();
				String auth = i.getAuthor();
				
				System.out.println("[Book Title => "+ name + ", Author Name => " + auth + ", ISBN number => " + isbn +  "]");
				
			}
		}
		else if(choise == 3) {
			
			System.out.println("Enter Author name: ");
			String author = sc.nextLine();
			
			List<Book> arr = lab.viewBooksByAuthor(author);
			
			if(arr.size() == 0) {

				System.out.println("Sorry there is no Book in Libaray!"); 
			}
			
			for(Book i : arr) {
				
				int isbn = i.getIsbn();
				String name = i.getBookName();
				String auth = i.getAuthor();
				
				System.out.println("[Book Title => "+ name + ", Author Name => " + auth + ", ISBN number => " + isbn +  "]");
				
			}
		}
		else {
			
			System.out.println("Enter Book name: ");
			String book = sc.nextLine();
			
			int n = lab.countNumberOfBooks(book);

			System.out.println(n + " are there in Library with name " + book);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library lab = new Library();
		
		int choise = 0;
		
		while(choise != 5) {
			
			System.out.println("Press 1 to Add Books");
			System.out.println("Press 2 to Display all book details");
			System.out.println("Press 3 to Search Book by author");
			System.out.println("Press 4 to Count number of books - by book name");
			System.out.println("Press 5 to Exit");
			System.out.println("=================================================");
			
			System.out.print("Press button: ");
			choise = sc.nextInt();
			
			
			sc.nextLine();
			
			LabAssistence(choise , lab);
		}
	}
}
