package problem3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Book> books = new LinkedHashSet<>();
		
		books.add(new Book(23, "Java" , "Ratan"));
		books.add(new Book(10, "c++" , "Arjun"));
		books.add(new Book(292, "Spring Boot" , "Ratan"));
		books.add(new Book(10, "Data Structure" , "Nrupul"));
		books.add(new Book(393, "c++" , "Arjun"));
		
//		System.out.println(books);
		
		
	}
}
