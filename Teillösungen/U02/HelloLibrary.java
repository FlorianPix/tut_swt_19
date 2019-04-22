public class HelloLibrary {   
   public static void main(String[] args) {
      Library myLib = new Library();

      Book b1 = new Book("UML");
      Book b2 = new Book("Java7");

      myLib.register(b1);
      myLib.register(b2);
	  
	  myLib.search("UML");
	  myLib.loan("Java7");
   }
}