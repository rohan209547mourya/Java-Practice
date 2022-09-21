package question4;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> bookList = new ArrayList<>();
	
	
	// Add Book Method
	void addBook(Book book) {
		
		this.bookList.add(book);
	}
	
	
	// Check Book length
	boolean isEmpty() {
		
		if(this.bookList.size() == 0) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	
	// View All Books In Libaray
	List<Book> viewAllBooks() {
				
		return this.bookList;
	}
	
	
	// Search Books by Author Name
	List<Book> viewBooksByAuthor(String auth){
		
		List<Book> newList = new ArrayList<>();
	
		for(int i = 0; i < this.bookList.size(); i++) {
			
			Book temp = this.bookList.get(i);
			
			if(temp.getAuthor().equalsIgnoreCase(auth)) {
				
				newList.add(temp);
			}
		}
		
		return newList;
	}
	
	
	// Count number of book its name
	int countNumberOfBooks(String name) {
		
		if(this.isEmpty()) {
			
			System.out.println("Sorry there is no Book in Libaray!");
		}
		
		int count = 0;
		
		for(int i = 0; i < this.bookList.size(); i++) {
			
			Book temp = this.bookList.get(i);
			
			if(temp.getBookName().equalsIgnoreCase(name)) {
				
				count++;
			}
			
		}
			
		return count;
	}
}
