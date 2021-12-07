package Builder_Pattern;

public class Coffee {
	
   //필수정보
	
    private String name ;
    private int price;
    
    private boolean ICE_YN;
    private boolean MILK_YN;
	
 

    public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}


	public boolean isICE_YN() {
		return ICE_YN;
	}

	public boolean isMILK_YN() {
		return MILK_YN;
	}

	private Coffee(CoffeeBuilder builder) {
        this.name=builder.name;
        this.price=builder.price;
        this.ICE_YN=builder.ICE_YN;
        this.MILK_YN=builder.MILK_YN;
    }
	

    public static class CoffeeBuilder{
 
 
        private String name ;
        private int price;
        
        private boolean ICE_YN;
        private boolean MILK_YN;
		
        public CoffeeBuilder(String name, int price){
            this.name=name;
            this.price=price;
        }
 
        public CoffeeBuilder ICE_YN(boolean ICE_YN) {
            this.ICE_YN = ICE_YN;
            return this;
        }
        
 
        public CoffeeBuilder MILK_YN(boolean MILK_YN) {
            this.MILK_YN = MILK_YN;
            return this;
        }
		
        public Coffee build(){
            return new Coffee(this);
        }
 
    }
 
}