package Command_Pattern;

public class Command_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainbowKick rainbowKick = new RainbowKick();
		MarseilleTurn marseilleTurn = new MarseilleTurn();
		
		Command rainbowKickCommand = new RainbowKickCommand(rainbowKick);
		Command marseilleTurnCommand = new MarseilleTurnCommand(marseilleTurn);
		FifaGame fifaGame = new FifaGame();
		
		fifaGame.setCommand(rainbowKickCommand);
		fifaGame.action();
		
		fifaGame.setCommand(marseilleTurnCommand);
		fifaGame.action();
		

	}

}
