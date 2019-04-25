package Library;

public class Book {
	private String isbn, author = "", title = "";
	
	public Book(String isbn, String author, String title) {
		this.isbn = isbn;
		this.author = author;
		this.title = title;
	}
	
	public Book(String isbn){
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		//TODO
		return null;
	}
	
	public int compareTo(Book b) {
		//TODO
		return 0;
	}
}
