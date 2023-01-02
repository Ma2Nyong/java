package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); // new 로 객체가 만드는것이다.
		baby.setBabyName("초롱이");//아기가 태어나고 나서 이름을 부여받은것.
		
		baby = new Baby("튼튼이");// 아기 이름을 정해놓고 나서 태어난것.
	}
}
