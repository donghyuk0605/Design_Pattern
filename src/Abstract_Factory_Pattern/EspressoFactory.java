package Abstract_Factory_Pattern;

public class EspressoFactory implements CoffeAbstractFactory {

	@Override
	public Coffee CreateCoffee() {
		// TODO Auto-generated method stub
		return new Espresso();
	}

}
