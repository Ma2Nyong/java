package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		
		//String s = (String)c; 가지고있는 타입 내에서만 변화가 가능하다.
	}
}
//polymorphism - 다형성
//분모를 큰수로 보고 자식을 작은수로 보아서 casting을 한다.