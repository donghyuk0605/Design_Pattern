package Abstract_Factory_Pattern;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		Coffee espresso = CoffeeFactory.getMilk(new EspressoFactory());
		Coffee americano = CoffeeFactory.getMilk(new AmericanoFactory());;
		System.out.println(espresso.getName());
		System.out.println(americano.getName());
	}
}
