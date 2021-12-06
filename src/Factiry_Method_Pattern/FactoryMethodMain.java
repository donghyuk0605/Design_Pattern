package Factiry_Method_Pattern;

public class FactoryMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TypeMilkFactory typeMilkFactory = new TypeMilkFactory();
		Milk StrawberryMilk = typeMilkFactory.createMilk("StrawberryMilk");
		Milk ChocoMilk = typeMilkFactory.createMilk("ChocoMilk");
		Milk WhiteMilk = typeMilkFactory.createMilk("WhiteMilk");
		
		System.out.println(StrawberryMilk.getName()); 
		System.out.println(ChocoMilk.getName()); 
		System.out.println(WhiteMilk.getName());


	}

}
