package uebung2_2;

public class Einwohner {
	protected int einkommen;   // tatsächliches Jahreseinkommen
	
	public void setEinkommen(int einkommen) {
		if (einkommen < 0) {
			throw new IllegalArgumentException();
		}
		this.einkommen = einkommen;
	}
	
	public int zuVersteuerndesEinkommen() {
		return this.einkommen;
    }
	
	public int steuer() {
		return this.zuVersteuerndesEinkommen() / 10;
    }
}

