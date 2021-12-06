package Abstract_Factory_Pattern;

public class CoffeeFactory {
	public static Coffee getMilk(CoffeAbstractFactory coffeAbstractFactory) {
		return coffeAbstractFactory.CreateCoffee();
	}
}
