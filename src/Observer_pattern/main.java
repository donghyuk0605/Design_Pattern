package Observer_pattern;

import Observer_pattern.Button.OnClicklistener;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button = new Button();
		button.setOnClickListener(null);
		button.onClick();
		
	}

}

class ButtonClick implements OnClicklistener{

	@Override
	public void onClick(Button button) {
		// TODO Auto-generated method stub
		System.out.println(button+"is Clicked");
	}
	

}