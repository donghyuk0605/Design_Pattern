package Command_Pattern;

public class ShootCommand implements Command {
	private Shoot shoot;
	
	public ShootCommand(Shoot shoot) {
		this.shoot = shoot;
	}
	
	@Override
	public void execute() {
		shoot.button();

	}

}
