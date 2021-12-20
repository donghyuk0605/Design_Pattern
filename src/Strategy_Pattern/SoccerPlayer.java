package Strategy_Pattern;

public class SoccerPlayer {
	private Kick skill;


	public void setFoot(Kick skill) {
		this.skill = skill;
	}//주발 셋팅
	
	public void Shoot() {
		skill.Shoot();
	}
	
	public void Pass() {
		skill.Pass();
	}
}
