package Observer_pattern2;

public class NewsSubscriber implements Observer{
private String observerName;
private String news;
private Publisher publisher;
public NewsSubscriber(String subscriber, Publisher publisher) 
{
	this.observerName = subscriber;
	this.publisher = publisher;
	publisher.add(this);
}

	
	@Override
	public void update(String title, String news) {
		// TODO Auto-generated method stub
		this.news = title+"!" + news;
		display();
	}
	
	private void display() {
		System.out.println(observerName+news);
	}

}
