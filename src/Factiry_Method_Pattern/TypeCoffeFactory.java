package Factiry_Method_Pattern;

public class TypeCoffeFactory extends Cofffefactory {

	@Override
	public Coffee createMilk(String type) {
		// TODO Auto-generated method stub
		Coffee milk;
		switch (type){
		case "Espresso":
			milk = new Espresso();
			break;
			
		case "Cafelatte":
			milk = new Cafelatte();
			break;
		case "Americano":
			milk = new Americano();
			break;	
		default:
			milk = new unordered();
			
		}
		return milk;
	}

}
