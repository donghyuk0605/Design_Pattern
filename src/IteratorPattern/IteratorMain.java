package IteratorPattern;

public class IteratorMain {
	public static void main(String[] args) {
		TransferMarketList transferMarketList = new TransferMarketList(3);
		transferMarketList.addSoccerPlayer(new SoccerPlayer("손흥민", 3000));
		transferMarketList.addSoccerPlayer(new SoccerPlayer("황희찬", 4000));
		transferMarketList.addSoccerPlayer(new SoccerPlayer("음바페", 3800));
		TransferMarketListIterator iterator = transferMarketList.createIterator();
	
		while (iterator.hasNext()) {
			SoccerPlayer soccerPlayer = (SoccerPlayer) iterator.next();
			System.out.println("선수 이름 : " + soccerPlayer.getName());
			System.out.println("선수 몸값 : " + soccerPlayer.getCost());
			//System.out.println(coffeeMenu.getLength());
			
		
		}
		System.out.println("영입시도");
		
		iterator = transferMarketList.createIterator();
		iterator.remove();//첫번재 선수 영입시도
		iterator.remove();
		iterator.remove();
		while (iterator.hasNext()) {
			SoccerPlayer soccerPlayer = (SoccerPlayer) iterator.next();
			System.out.println("선수 이름 : " + soccerPlayer.getName());
			System.out.println("선수 몸값 : " + soccerPlayer.getCost());
		}
	}

}
