package problem3;

import java.util.Objects;

public class Book {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	
	public Book() {
		
	}
	
	
	public Book(int bookId, String bookName, String bookAuthor) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}




	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Book obj1 = (Book) obj;
		
		return this.bookId == obj1.bookId;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(this.bookId);
	}
	
	@Override
	public String toString() {
		
		return "[Book Name => " + this.bookName + ", Book Author => " + this.bookAuthor + ", Book ID => " + this.bookId +"]";
	}
}
