package Bottle;

public class Bottle<T extends Drink> {
	private Drink content;
	
	public Bottle(Drink content) {
		this.content = content;
	}
	
	public boolean isEmpty() {
		//TODO
		return false;
	}
	
	public void fill(Drink content) {
		//TODO
	}
	
	public Drink empty() {
		//TODO
		return null;
	}
}
