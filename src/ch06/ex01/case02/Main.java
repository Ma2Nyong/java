package ch06.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
	}
}
// 상속 쓰지마라 문제가 많다.
// 상속을 쓰면 오히려 유지보수가 어려워진다.
// extands를 사용하지말고 implemaents 를 써라.