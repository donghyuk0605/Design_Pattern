package Singleton_Pattern;

public class DB_Server { 
	static private DB_Server instance; //인스턴스 초기화 
	private int user; 
	private DB_Server() {
	   user=10; //기본 유저
	}
	public static DB_Server getInstance() {
		if(instance == null ) { // 널이면 겍체 생
			
			instance  = new DB_Server();
		}
		
		return instance;
	}
	
	
	//* getter, setter
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
}
