package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

		
	List<Book> bookList = new ArrayList<>();
	
	
	public void addBook(Book book) {
		
		
		bookList.add(book);	
		System.out.println("Book added successfully!");
	}
	
	public boolean isEmpty() {
		
		if(bookList.size() == 0) {
			
			return true;
		}
		
		return false;
	}
	
	public List<Book> viewAllBooks() {
		
		return bookList;
	}
	
	public List<Book> viewAllBooksByAuthor(String auth) {
		
		List<Book>  newList = new ArrayList<>();
		
		for(Book el : bookList) {
			
			if(el.getAuthor().equalsIgnoreCase(auth)) {
				
				newList.add(el);
			}
		}
		
		return newList;
	}
	
	public int countNoOfBooks(String book) {
		
		int count = 0;
	
		
		for(Book el : bookList) {
			
			if(el.getBookName().equalsIgnoreCase(book)) {
				
				count++;
			}
		}
		
		return count;
	}
	
}
