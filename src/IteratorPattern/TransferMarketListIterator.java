package IteratorPattern;

public class TransferMarketListIterator implements Iterator {
	private TransferMarketList transferMarketList;
	private int index;
	
	public TransferMarketListIterator(TransferMarketList transferMarketList) {
		this.transferMarketList = transferMarketList;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		return index < transferMarketList.getLength();
		// 값이 존재 확인
		
	}

	@Override
	public Object next() {
		SoccerPlayer soccerPlayer = transferMarketList.getSoccerPlayer(index);
		index++;
		return soccerPlayer;
	}

	@Override
	public void remove() {
		transferMarketList.removeSoccerPlayer(index);
		
	}

}
