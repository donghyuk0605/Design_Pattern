package Observer_pattern2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPublisher newsPublisher = new NewsPublisher();
		
		NewsSubscriber newSubscriber1 = new NewsSubscriber("����1",newsPublisher);
		NewsSubscriber newSubscriber2 = new NewsSubscriber("����2",newsPublisher);
		
		newsPublisher.setNews("ù��°","����1");
		newsPublisher.setNews("�ι�°","����1");
		newsPublisher.setNews("�Ӻ�", "������ ���� ������ �߽��ϴ�.");
	}

}
