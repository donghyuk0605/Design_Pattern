package Decorator_Pattern;

public class Decorator implements CoffeeComponent {
	private CoffeeComponent coffeecompoent;
	
	public Decorator(CoffeeComponent coffeecompoent) {
	this.coffeecompoent = coffeecompoent;
	}
	@Override
	public String Ingredients() {
		// TODO Auto-generated method stub
		return coffeecompoent.Ingredients();
	}

}
