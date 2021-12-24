package Command_Pattern;

public class MarseilleTurnCommand implements Command {
	private MarseilleTurn marseilleTurn;
	
	public MarseilleTurnCommand(MarseilleTurn marseilleTurn) {
		this.marseilleTurn = marseilleTurn;
	}
	
	@Override
	public void execute() {
		marseilleTurn.buttonA();

	}

}
