package Adapter_Pattern;

public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		ALZip ALzip = new EGG();
		ALzip.unalzip("test.EGG");
//		ALZip ALzip2 = new Zip(); 어탭터 없이는 해당 객체를 사용할수없음.
		ALzip = new FormatAdapter(new Zip());
		ALzip.unalzip("test.ZIP");
		
		
	}

}
