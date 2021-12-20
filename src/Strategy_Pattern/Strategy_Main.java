package Strategy_Pattern;

public class Strategy_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final	SoccerPlayer 손흥민 = new SoccerPlayer();
	final	SoccerPlayer 케인 = new SoccerPlayer();
	
	final Kick 발리 = new ValleyKick();
	final Kick 힐 = new HeelKick();
	final Kick 라보나 = new RabonaKick();
	// 세팅은 상수로 선언
	//다형성
	
	손흥민.setFoot(발리);
	케인.setFoot(라보나);
	
	손흥민.Shoot();
	케인.Shoot();
	손흥민.Pass();
	
	손흥민.setFoot(힐);
	손흥민.Pass();
	}

}
