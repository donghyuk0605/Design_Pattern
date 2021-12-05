package Observer_pattern;

public class Button {
	public void onClick() {
		//이벤트 처리
		if(onClicklistener != null )
			onClicklistener.onClick(this);
	}
	
	public interface OnClicklistener {
		public void onClick(Button button);
		
	}
	
	private OnClicklistener onClicklistener;
	
	public void setOnClickListener(OnClicklistener onClicklistener) {
		this.onClicklistener = onClicklistener;
	}
	
}
