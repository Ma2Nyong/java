package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		//Card.kind;
		//Card.number; 객체를 생서하지 않아 존재하지 않기에 불러올수없다
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height);
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
	}
}//static variable 은 class.-- 으로 입력해야한다.
//lock: 잠그다 queue: 줄을 선다.(순서를 기다린다?)
