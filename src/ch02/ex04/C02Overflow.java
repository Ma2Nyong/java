package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128;
		byte b = 127;
		//b = b + 1;
		
		b++; // 2진수로 표현할 때 1111111 에서 진수를 하나 올리는 문법이기에
		b++; // 10000000 이 되며 -128이 된다. 하나 더 올리면 -127이 된다.
		System.out.println(b);
	}
}
