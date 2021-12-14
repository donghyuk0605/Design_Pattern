package Strategy_Pattern;

public class Strategy_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final	SoccerPlayer 손흥민 = new SoccerPlayer();
	final	SoccerPlayer 케인 = new SoccerPlayer();
	
	final Foot 오른발 = new RightFoot();
	final Foot 왼발 = new LeftFoot();
	// 세팅은 상수로 선언
	//다형성
	
	손흥민.setFoot(왼발);
	케인.setFoot(오른발);
	
	손흥민.Shoot();
	케인.Shoot();
	손흥민.Pass();

	}

}
