package problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	
	List<Book> books = new ArrayList<>();
	
	void addBook(Book book) throws BookException{
		
		if(book == null) {
			
			System.out.println("Invalid Input");
			
			return;
		}
		
		if(findDuplicate(book)) {
			
			throw new BookException("Book is already Exist");
			
		}
		else {
			
			this.books.add(book);
		}
		
		
	}
	
	boolean findDuplicate(Book book) {
		
		return this.books.stream().anyMatch(p -> p.equals(book));
	}
	
	
	
	
	List<Book> viewAllBooks()throws BookException{
		
		if(this.books.size()  == 0) {
			
			throw new BookException("Lirary is empty!");
		}
		
		List<Book> newList = new ArrayList<>(this.books);
	
		Collections.sort(newList , (b1 , b2) -> b1.getBookName().compareToIgnoreCase(b2.getBookName()));
		
		return newList;
	}
	
	
	List<Book> viewBooksByAuthor(String author)throws BookException{
		
		List<Book> newList = this.books.stream()	
									   .filter(s -> s.getAuthor().equalsIgnoreCase(author))
									   .collect(Collectors.toList());
		
		if(newList.size() == 0) {
			
			throw new BookException("None of the book published by the " + author);
		}
		
		return newList;
	}
	
	
	Book getBookByISBN(int isbn)throws BookException{
		
		
		
		for(Book el : books) {
			
			
			if(el.getIsbn() == isbn) {
				
				return el;
			}
			
		}
		
		throw new BookException("No book found with this isbn");
	}
}
