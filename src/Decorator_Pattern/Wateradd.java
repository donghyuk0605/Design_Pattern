package Decorator_Pattern;

public class Wateradd extends Decorator {
	
	public Wateradd(CoffeeComponent coffeecomponent) {
		super(coffeecomponent);
	}
	@Override
	public String Ingredients() {
		// TODO Auto-generated method stub
		return super.Ingredients()+ "물";
	}
	
	
}
