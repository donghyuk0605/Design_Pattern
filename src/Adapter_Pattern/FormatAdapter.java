package Adapter_Pattern;

public class FormatAdapter implements ALZip {
	private WinZip WinZip;
	
	public FormatAdapter(WinZip WinZip) {
		this.WinZip= WinZip;
	}
	
	@Override
	public void unalzip(String filefomat) {
		System.out.println("압축 푸는중..");
		WinZip.unzip(filefomat);
	}

}
