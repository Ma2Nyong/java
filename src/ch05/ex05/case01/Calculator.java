package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	/*
	public int add(int x, int y) {
		return x + y;
	} // add int int 중복된다.
	// compiler는 data 변수에 관심이없고 data type에 관심이 있기에 중복처리된다.
	*/
	
	public int add(int a, int b, int c) {
		return a + b + c;
	} // data를 표현하는 방식이 아니기에 domain이라 부르지 않는다.
}
