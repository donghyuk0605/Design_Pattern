package IteratorPattern;

public class IteratorMain {
	public static void main(String[] args) {
		// 이적시장(배열) 크기 지정
		TransferMarketList transferMarketList = new TransferMarketList(3);
		
		// 이름과 몸값 삽입
		transferMarketList.addSoccerPlayer(new SoccerPlayer("손흥민", 3000));
		transferMarketList.addSoccerPlayer(new SoccerPlayer("황희찬", 4000));
		transferMarketList.addSoccerPlayer(new SoccerPlayer("음바페", 3800));
		
		//이터레이터 생성
		TransferMarketListIterator iterator = transferMarketList.createIterator();
		
		System.out.println("이적시장 명단");
		while (iterator.hasNext()) {
			
			//요소를 탐색
			SoccerPlayer soccerPlayer = (SoccerPlayer) iterator.next();

			System.out.println("선수 이름 : " + soccerPlayer.getName());
			System.out.println("선수 몸값 : " + soccerPlayer.getCost());
			//System.out.println(coffeeMenu.getLength());
			
		
		}
		System.out.println("----첫번째 영입 시도 후 이적시장 명단------");
		
		iterator = transferMarketList.createIterator();
		iterator.remove();//첫번재 선수 영입시도
		while (iterator.hasNext()) {
			SoccerPlayer soccerPlayer = (SoccerPlayer) iterator.next();
			System.out.println("선수 이름 : " + soccerPlayer.getName());
			System.out.println("선수 몸값 : " + soccerPlayer.getCost());
		}
	}

}
