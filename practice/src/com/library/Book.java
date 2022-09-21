package com.library;

public class Book {
	
	private int isbn;
	private String author;
	private String bookName;
	
	public Book() {
		
		
	}
	
	public Book(int isbnNo , String authorName, String bookName) {
		
		super();
		
		this.author = authorName;
		this.bookName = bookName;
		this.isbn = isbnNo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
}
