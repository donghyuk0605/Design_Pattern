package Adapter_Pattern;

public class Zip implements WinZip {

	@Override
	public void unzip(String filefomat) {
		// TODO Auto-generated method stub
		System.out.println("압축 푸는중.."+filefomat);
	}
		
}
