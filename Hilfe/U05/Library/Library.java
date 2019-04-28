//import ArrayList or LinkedList
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Library {
	private List<Book> stock;
	
	public Library() {
		//instantiate stock as new ArrayList or LinkedList
	}
	
	public void sortedInsertion(Book newBook) {
		//add newBook to stock
        //use sort method of Collections because else binarySearch wont work
	}
	
	public Book searchForIsbn(String isbn) {
		//use binarySearch of Collections
		//if that the given index is < 0 return null
		//else get Book with that index from stock
	}
	
	public Collection<Book> searchForAuthor(String author){
		//create new ArrayList or LinkedList
		//iterate over stock
		//check if a book has the search author
		//return all books with the search author
	}
}
