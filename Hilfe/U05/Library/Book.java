public class Book implements Comparable<Book>{
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
		return "ISBN: " + this.isbn 
				+ ", Autor: " + this.author 
				+ ", Titel: " + this.title;
	}
	
	public int compareTo(Book b) {
		//use compareTo of Strings to compare isbn
	}
	
	public boolean equals(Book b){
    		//use equals of String to compare isbn
    	}
    
    	public int hashCode() {
    		//use hashCode of Strings on isbn
    	}
}
