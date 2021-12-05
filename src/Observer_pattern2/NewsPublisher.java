package Observer_pattern2;

import java.util.ArrayList;

public class NewsPublisher implements Publisher {
	private ArrayList<Observer> observers;
	private String title;
	private String news;
	
	public NewsPublisher() {
		observers = new ArrayList<>();
		title = null;
		news = null;
	}
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(title, news);
		}
	}
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	
	public void setNews(String title,String news) {
		this.title = title;
		this.news = news;
		notifyObserver();
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNews() {
		return news;
	}


	
	

}
