package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		// 과제: 아래 compile error 를 해결하라.
		//		 byte c 는 건드리지 않는다. byte c = a + b;
		byte c = (byte)(a + b);
		System.out.println(c);
		
		//c = c + 1;
		c++;
		System.out.println(c);
		
		double d = a / b; //int type이라서 1.0이라는 값이 나온다.
		System.out.println(d);
		
		//과제 :d 변수에 1.5가 저장되도록하라.
		d = (double)a / b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		
		d = (double)(a / b);
		System.out.println(d);
		d = a / b * 1.0;
		System.out.println(d);
	}
}
// 산술 연산자