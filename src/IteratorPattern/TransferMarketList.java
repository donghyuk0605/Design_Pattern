package IteratorPattern;

public class TransferMarketList implements Aggregate {
	private SoccerPlayer[] soccerPlayers;
	private int size = 0;

	public TransferMarketList(int size) {
		soccerPlayers = new SoccerPlayer[size];
	}

	public SoccerPlayer getSoccerPlayer(int index) {
		return soccerPlayers[index];
	}

	public void addSoccerPlayer(SoccerPlayer soccerPlayer) {
		soccerPlayers[size] = soccerPlayer;
		size++;

	}

	public int getLength() {
		return size;
	}

	public void removeSoccerPlayer(int index) {
		for (int i = index; i < size - 1; i++) {
			soccerPlayers[i] = soccerPlayers[i + 1];
			// 한칸씩 배열갚을 앞에다 넣우줌
		}
		size--;
	}

	@Override
	public TransferMarketListIterator  createIterator() {
		// TODO Auto-generated method stub
		return new TransferMarketListIterator(this);
	}

}
