package ch06.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
	}
}
//6장: 상속 / 코드 중복을 최소화, 없애는 것이 목적이다