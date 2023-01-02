package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A(); // 내가 필요로 하는 기능이 있기에 사용한다.
		
		int x = 0;
		//x = a.a;
		x = a.b;
		x = a.c;
		x = a.d;
		
		//a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}
