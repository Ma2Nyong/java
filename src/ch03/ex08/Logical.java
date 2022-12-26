package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		//논리 연산자
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 2 < 1 && 2 > 1 ; // AND 연산자.
		b = 2 < 1 || 2 > 1; // OR 연산자.
		b = 2 < 1 || 2 < 1;
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; // && and 연산자 의 특징은 앞의 값이 
		//false 이면 뒤의 값을 계산안한다 그래서 y 값은 0이다.
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0;
		
		x = 0; // 연산자가 하나짜리를 쓸 경우는 결과값이 나와도 계속 계산한다.
		y = 0;
		b = ++x > 0 | ++y < 0;
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
		
	}
}
