package ch04.ex04;

import java.util.Scanner;

public class C01Dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			
			System.out.print("b: ");
			b = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n\n", a, b, result = a + b);
		} while(result != 0);
	}
}
// 참된 데이터를 입력할때까지 반복해서 실행할 수 있다.
// 조건문이 뒤에 있기에 1회이상 반복 할때 사용한다.