package uebung2_2;

public class Adel extends Einwohner {
		public int steuer() {
			int steuer = super.steuer();
			if(steuer < 20) {
				return 20;
			}
			return steuer;
    }
}

