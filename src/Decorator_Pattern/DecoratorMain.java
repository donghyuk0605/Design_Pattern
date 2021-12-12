package Decorator_Pattern;

public class DecoratorMain {

	public static void main(String[] args) {
			CoffeeComponent espresso = new BaseCoffeeComponent();
			System.out.println("에스프레소"+espresso.Ingredients());
			
			CoffeeComponent americano = new Wateradd(new BaseCoffeeComponent());
		    System.out.println("아메리카노 : " + americano.Ingredients());     
		    
		    CoffeeComponent cafelatte = new Milkadd(new Wateradd(new BaseCoffeeComponent()));
		    System.out.println("카페라떼 : " + cafelatte.Ingredients());
			
					

	}

}
