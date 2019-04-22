package uebung2_2;

public class Leibeigener extends Bauer {
	@Override
	public int zuVersteuerndesEinkommen() {
			int steuer = super.zuVersteuerndesEinkommen();
			steuer -= 12;
			return steuer >= 0 ? steuer : 0;
	}
}
