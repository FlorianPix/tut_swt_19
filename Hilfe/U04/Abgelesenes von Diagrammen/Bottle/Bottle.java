public class Bottle<T extends Drink> {
	private T content;
	
	public Bottle(T content) {
		this.content = content;
	}
	
	public boolean isEmpty() {
		//TODO
		return false;
	}
	
	public void fill(T content) {
		//TODO
	}
	
	public T empty() {
		//TODO
		return null;
	}
}
