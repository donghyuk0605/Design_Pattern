package IteratorPattern;

public class SoccerPlayer {
	private String name; //선수이름 
	private int cost; //선수 몸값
	
	public SoccerPlayer(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	//getter
	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}
	
}
