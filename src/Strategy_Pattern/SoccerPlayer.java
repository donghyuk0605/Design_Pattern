package Strategy_Pattern;

public class SoccerPlayer {
	private Foot foot;


	public void setFoot(Foot foot) {
		this.foot = foot;
	}//주발 셋팅
	
	public void Shoot() {
		foot.Shoot();
	}
	
	public void Pass() {
		foot.Pass();
	}
}
