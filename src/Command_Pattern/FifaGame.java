package Command_Pattern;

public class FifaGame {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void action() {
		command.execute();
	}
}
