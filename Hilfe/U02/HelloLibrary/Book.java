public class Book {

    private String title;
	private boolean state;
	
    public Book(String title) {
        this.title = title;
	this.state = true;
    }
	
    public void setState(boolean state){
	this.state = state;
    }

    public String toString() {
        return this.title;
    }
}
