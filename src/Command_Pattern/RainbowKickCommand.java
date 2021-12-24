package Command_Pattern;

public class RainbowKickCommand implements Command {
	private RainbowKick rainbowKick;
	
	public RainbowKickCommand(RainbowKick rainbowKick) {
		this.rainbowKick = rainbowKick;
	}

	@Override
	public void execute() {
		rainbowKick.buttonB();

	}

}
