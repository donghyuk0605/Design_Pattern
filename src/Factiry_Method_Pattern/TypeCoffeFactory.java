package Factiry_Method_Pattern;

public class TypeCoffeFactory extends Cofffefactory {

	@Override
	public Coffee createMilk(String type) {
		// TODO Auto-generated method stub
		Coffee coffee;
		switch (type){
		case "Espresso":
			coffee = new Espresso();
			break;
			
		case "Cafelatte":
			coffee = new Cafelatte();
			break;
		case "Americano":
			coffee = new Americano();
			break;	
		default:
			coffee = new unordered();
			
		}
		return coffee;
	}

}
