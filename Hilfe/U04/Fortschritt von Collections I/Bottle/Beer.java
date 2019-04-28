public class Beer extends Drink{
	private String brewery;
	
	public Beer(String brewery) {
		this.brewery=brewery;
	}
	
	public String getBrewery() {
		return this.brewery;
	}
	
	public String toString() {
		return this.brewery;
	}
}
