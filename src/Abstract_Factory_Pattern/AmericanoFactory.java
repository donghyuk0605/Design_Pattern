package Abstract_Factory_Pattern;

public class AmericanoFactory implements CoffeAbstractFactory {

	@Override
	public Coffee CreateCoffee() {
		// TODO Auto-generated method stub
		return new Americano();
	}


}
