package Singleton_Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB_Server webserver1 = DB_Server.getInstance(); //1번 웹서버
		DB_Server webserver2 = DB_Server.getInstance(); //2번 웹서버
		webserver1.setUser(15); //유저수 변경
		webserver2.setUser(20);
		webserver1.setUser(40);
    System.out.println(webserver1.getUser()); //유저수 조회
    System.out.println(webserver2.getUser());
	}

}
