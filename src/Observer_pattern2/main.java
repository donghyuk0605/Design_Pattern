package Observer_pattern2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPublisher newsPublisher = new NewsPublisher();
		
		NewsSubscriber newSubscriber1 = new NewsSubscriber("구독1",newsPublisher);
		NewsSubscriber newSubscriber2 = new NewsSubscriber("구독2",newsPublisher);
		
		newsPublisher.setNews("첫번째","내용1");
		newsPublisher.setNews("두번째","내용1");
		newsPublisher.setNews("속보", "누군가 구독 해제를 했습니다.");
	}

}
