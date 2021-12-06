package Factiry_Method_Pattern;

public class FactoryMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TypeCoffeFactory typeCoffeFactory = new TypeCoffeFactory();
		Coffee Cafelatte = typeCoffeFactory.createMilk("Cafelatte");
		Coffee ChocoMilk = typeCoffeFactory.createMilk("Espresso");
		Coffee Americano = typeCoffeFactory.createMilk("Americano");
		Coffee unordered = typeCoffeFactory.createMilk("");
		System.out.println(Cafelatte.getName()); 
		System.out.println(ChocoMilk.getName()); 
		System.out.println(Americano.getName());
		System.out.println(unordered.getName());
//new를 통해 객체생성하지않음
	}

}
