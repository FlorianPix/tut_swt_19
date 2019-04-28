public class Main {
	public static void main(String[] args) {
		Beer beer1 = new Beer("Sterni");
		Bottle<Beer> beer_bottle = new Bottle<Beer>();
		beer_bottle.fill(beer1);
		beer_bottle.empty();
		//No problem.
		
		Wine wine2 = new WhiteWine("Lunel");
		beer_bottle.fill(wine2); 
		//Error: The method fill(Beer) of Bottle<Beer> is not applicable for the arguments (Wine).
		
		Wine wine1 = new Wine("Burgunder");
		//Error: Cannot instantiate the type Wine (because the class Wine is abstract).
		
		Bottle<Wine> wine_bottle = new Bottle<Wine>();
		wine_bottle.fill(wine2);
		wine_bottle.empty();
		//No problem.
	}
}
