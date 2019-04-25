public class Bottle<T extends Drink> {
	private T content;
	
	public boolean isEmpty() {
		if (this.content == null) {
			return true;
		}
		return false;
	}
	
	public void fill(T content) {
		if (!this.isEmpty()) {
			throw new IllegalStateException();
		}
		this.content = content;
	}
	
	public T empty() {
		if (this.isEmpty()) {
			throw new IllegalStateException();
		}
		T drink = this.content;
		this.content = null;
		return drink;
	}
}
