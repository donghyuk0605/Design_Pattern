package Command_Pattern;

public class PassCommand implements Command {
	private Pass pass;
	
	public PassCommand(Pass pass) {
		this.pass = pass;
	}
	
	@Override
	public void execute() {
		pass.button();

	}

}
