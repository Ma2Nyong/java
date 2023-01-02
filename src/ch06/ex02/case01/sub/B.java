package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A(); // 같은 패키지에서 찾고 없으면 library에서 찾는다 없어서 임폴트 추가.
		
		int x = 0;
		//x = a.a;
		//x = a.b; // defalt
		//x = a.c; // protected 둘다 같은 패키지에서만 제공.
		x = a.d;
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();
	}
}
