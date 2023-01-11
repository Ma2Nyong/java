package ch09.ex04;

public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		new Thread(new Producer("P1", buffer)).start();
		new Thread(new Producer("P2", buffer)).start();
		
		new Thread(new Consumer("C1", buffer)).start();
		new Thread(new Consumer("C2", buffer)).start();
	}
}
// consumer 멘트가 안나온다, 이유는? 아무도 모른다.