package ch06.ex03.case02;

public class Cat extends Animal {
	@Override //annotation 컴파일러가 컴파일시 사용한다. 재정의.
	public void shout() {
		System.out.println("야옹야옹");
	}
}
