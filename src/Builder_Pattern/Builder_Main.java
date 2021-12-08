package Builder_Pattern;

public class Builder_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee iceAmericano = new Coffee.CoffeeBuilder("아이스아메리카노", 2000)
				.setICE_YN(true)
				.setMILK_YN(false)
				.build();
		Coffee hotCafelatte= new Coffee.CoffeeBuilder("카페라떼", 3000)
				.setICE_YN(false)
				.setMILK_YN(true)
				.build();
		System.out.println(iceAmericano.getName()+iceAmericano.getPrice());
		System.out.println(hotCafelatte.getName()+hotCafelatte.getPrice());
	}

}
