package Factiry_Method_Pattern;

public class TypeMilkFactory extends Milkfactory {

	@Override
	public Milk createMilk(String type) {
		// TODO Auto-generated method stub
		Milk milk;
		switch (type){
		case "choco":
			milk = new ChocoMilk();
			break;
			
		case "Strawberry":
			milk = new StrawberryMilk();
			break;
		default:
			milk = new WhiteMilk();
			
		}
		return milk;
	}

}
