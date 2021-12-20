package IteratorPattern;

public class TransferMarketList implements Aggregate {
	private SoccerPlayer[] soccerPlayers;
	private int size = 0;

	public TransferMarketList(int size) {
		soccerPlayers = new SoccerPlayer[size];
		//배열 사이즈 초기값 지정
	}

	public SoccerPlayer getSoccerPlayer(int index) {
		return soccerPlayers[index];
		//축구선수 값 가져오기 
	}

	public void addSoccerPlayer(SoccerPlayer soccerPlayer) {
		soccerPlayers[size] = soccerPlayer;
		size++;
		//축구선수 값 삽입

	}

	public int getLength() {
		return size;
	}

	public void removeSoccerPlayer(int index) {
		for (int i = index; i < size - 1; i++) {
			soccerPlayers[i] = soccerPlayers[i + 1];
			// 한칸씩 배열갚을 앞에 다 넣우줌
		}
		size--;
		
	}

	@Override
	public TransferMarketListIterator  createIterator() {
		// TODO Auto-generated method stub
		return new TransferMarketListIterator(this);
	}

}
