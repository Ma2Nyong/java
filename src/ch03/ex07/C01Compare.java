package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B' ; // true
		b = '0' == 0; // false
		b = 'A' != 65; // false
		
		b = 10.0 == 10.0f; // true
		b = 0.1 == 0.1f;
		b = (float)0.1 == 0.1f;
		
		System.out.println(b);
	}
}
//비교 연산자