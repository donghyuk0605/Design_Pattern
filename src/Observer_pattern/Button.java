package Observer_pattern;

public class Button {
	public void onClick() {
		//�̺�Ʈ ó��
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
