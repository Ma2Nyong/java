package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		}; // 두 개 이상의 명령문을 쓸때는 이렇게 쓸 수도 있다.
		// return외에 다른 명령문을 사용할때 쓴다. 허나 람다 스럽지 않다.
		calculator = (a, b) -> a + b; // 이게 맞는거다.
		
		System.out.println(calculator.calc(1, 2));
	}
}
