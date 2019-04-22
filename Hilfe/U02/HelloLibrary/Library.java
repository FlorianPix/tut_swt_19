public class Library {

   private Book [] myBooks;

   private int number;

   public Library() {
	   myBooks = new Book[10];
       number = 0;
       }

   public void register(Book book) {
       myBooks[number] = book;
       number += 1;
       System.out.println("A new book is registered: " + book);
    }
	
	public void search(String title){
		/**
		* Schreiben Sie für die Klasse Library eine Methode search(), die prüft, ob
		* das gesuchte Buch (mit einem bestimmten Titel) in der Bibliothek registriert ist.
		*/
		int i = 0;
		while(i < number){
			if(title.equals(myBooks[i].toString())){
				System.out.println("The book with the title \"" + title + " \" is registered.");
			}
			i++;
		}
	}
	
	public void loan(String title){
		/**
		* Schreiben Sie für die Klasse Library eine Methode loan(), die ein Buch mit
		* einem bestimmten Titel ausleiht. Ein Benutzer soll nicht berücksichtigt werden!
		*/
		for(int i = 0; i < number; i++){
			if(title.equals(myBooks[i].toString())){
				myBooks[i].setState(false);
			}
		}
	}
}