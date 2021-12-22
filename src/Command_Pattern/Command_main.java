package Command_Pattern;

public class Command_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoot shoot = new Shoot();
		Pass pass = new Pass();
		
		Command ShootCommand = new ShootCommand(shoot);
		Command PassCommand = new PassCommand(pass);
		FifaGame fifaGame = new FifaGame();
		
		fifaGame.setCommand(ShootCommand);
		fifaGame.action();
		
		fifaGame.setCommand(PassCommand);
		fifaGame.action();
		
		

	}

}
